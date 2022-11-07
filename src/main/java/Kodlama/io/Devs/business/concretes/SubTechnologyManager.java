package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.business.reponses.subTechnology.GetIdSubTechnologyResponse;
import Kodlama.io.Devs.business.reponses.subTechnology.GetAllSubTechnologyResponse;
import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.dataAccess.abstacts.SubTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import Kodlama.io.Devs.entities.concretes.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {

    SubTechnologyRepository subTechnologyRepository;

    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
        this.subTechnologyRepository = subTechnologyRepository;
    }

    @Override
    public List<GetAllSubTechnologyResponse> getAll() {
        List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
        List<GetAllSubTechnologyResponse> subTechnologyResponse = new ArrayList<GetAllSubTechnologyResponse>();

        for(SubTechnology subTechnology:subTechnologies){
            GetAllSubTechnologyResponse responseItem = new GetAllSubTechnologyResponse();
            responseItem.setId(subTechnology.getId());
            responseItem.setName(subTechnology.getName());
            subTechnologyResponse.add(responseItem);
        }
        return subTechnologyResponse;
    }

    @Override
    public CreateSubTechnologyRequest add(CreateSubTechnologyRequest createSubTechnologyRequest) {
        SubTechnology subTechnology = new SubTechnology();
        subTechnology.setId(createSubTechnologyRequest.getId());
        subTechnology.setName(createSubTechnologyRequest.getName());
        subTechnology.setLanguageId(createSubTechnologyRequest.getLanguageId());
        subTechnologyRepository.save(subTechnology);
        return createSubTechnologyRequest;
    }

    @Override
    public GetIdSubTechnologyResponse getById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Language updateOnSubTechnology(int subTechnologyId, SubTechnology subTechnology) {
        return null;
    }
}
