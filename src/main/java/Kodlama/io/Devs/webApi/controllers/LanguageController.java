package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.reponses.language.GetAllLanguageResponse;
import Kodlama.io.Devs.business.reponses.language.GetIdLanguageResponse;
import Kodlama.io.Devs.business.requests.language.CreateLanguageRequest;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguageResponse> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public Language add(@RequestBody CreateLanguageRequest createLanguageRequest){
        return this.languageService.add(createLanguageRequest);
    }

    @GetMapping("/{id}")
    public GetIdLanguageResponse getById(@PathVariable int id){
        return this.languageService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id){
        this.languageService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Language updateOnLanguage(@PathVariable int id,@RequestBody Language language){
        return this.languageService.updateOnLanguage(id,language);
    }

}
