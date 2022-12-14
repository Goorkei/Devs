package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.reponses.language.GetAllLanguageResponse;
import Kodlama.io.Devs.business.reponses.language.GetIdLanguageResponse;
import Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguageResponse> getAll();
    Language add(CreateLanguageRequest createLanguageRequest);
    GetIdLanguageResponse getById(int id);
    void deleteById(int id);
    Language updateOnLanguage(int languageId,Language language);
}
