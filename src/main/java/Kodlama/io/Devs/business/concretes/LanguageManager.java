package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.reponses.GetAllLanguageResponse;
import Kodlama.io.Devs.business.reponses.GetIdLanguageResponse;
import Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import Kodlama.io.Devs.dataAccess.abstacts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LanguageManager implements LanguageService {

    LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguageResponse> programmingLanguagesResponses = new ArrayList<GetAllLanguageResponse>();
        for (Language language : languages) {
            GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
            responseItem.setId(language.getId());
            responseItem.setLanguage(language.getLanguage());
            programmingLanguagesResponses.add(responseItem);
        }
        return programmingLanguagesResponses;
    }

    @Override
    public Language add(CreateLanguageRequest createLanguageRequest) {
        Language language = new Language();

        List<Language> languages = this.languageRepository.findAll();
        
        if (language.getLanguage() != null & language.getLanguage() != "") {
            for (Language templanguage : languages) {
                if (templanguage.getLanguage().equals(createLanguageRequest.getLanguage())) {
                    return null;
                }
            }
        } else
            return null;

        language.setLanguage(createLanguageRequest.getLanguage());
        this.languageRepository.save(language);
        return language;
    }

    @Override
    public GetIdLanguageResponse getById(int id) {
        Language language = languageRepository.findById(id).orElse(null);
        if (language != null) {
            GetIdLanguageResponse getIdLanguageResponse = new GetIdLanguageResponse();
            getIdLanguageResponse.setId(id);
            getIdLanguageResponse.setLanguage(language.getLanguage());
            return getIdLanguageResponse;
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        this.languageRepository.deleteById(id);
    }

    @Override
    public Language updateOnLanguage(int languageId, Language newLanguage) {
        Optional<Language> language = this.languageRepository.findById(languageId);

        if (language.isPresent()) {
            Language foundLanguage = language.get();
            foundLanguage.setId(languageId);
            foundLanguage.setLanguage(newLanguage.getLanguage());
            languageRepository.save(foundLanguage);
            return foundLanguage;
        } else
            return null;

    }
}
