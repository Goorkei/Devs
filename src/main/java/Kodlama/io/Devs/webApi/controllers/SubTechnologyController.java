package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.business.reponses.subTechnology.GetAllSubTechnologyResponse;
import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subtechnology")
public class SubTechnologyController {

    SubTechnologyService subTechnologyService;
    public SubTechnologyController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }

    @GetMapping("/getall")
    public List<GetAllSubTechnologyResponse> getAll(){
        return subTechnologyService.getAll();
    }

    @PostMapping("/add")
    public CreateSubTechnologyRequest add(@RequestBody CreateSubTechnologyRequest createSubTechnologyRequest){
        return subTechnologyService.add(createSubTechnologyRequest);
    }


}
