package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.reponses.subTechnology.GetIdSubTechnologyResponse;
import Kodlama.io.Devs.business.reponses.subTechnology.GetAllSubTechnologyResponse;
import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.entities.concretes.Language;
import Kodlama.io.Devs.entities.concretes.SubTechnology;

import java.util.List;

public interface SubTechnologyService {
    List<GetAllSubTechnologyResponse> getAll();
    CreateSubTechnologyRequest add(CreateSubTechnologyRequest createSubTechnologyRequest);
    GetIdSubTechnologyResponse getById(int id);
    void deleteById(int id);
    Language updateOnSubTechnology(int subTechnologyId,SubTechnology subTechnology);
}
