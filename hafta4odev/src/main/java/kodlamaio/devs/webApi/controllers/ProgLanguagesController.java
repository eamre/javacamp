package kodlamaio.devs.webApi.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import kodlamaio.devs.business.abstracts.ProgLanguageService;
import kodlamaio.devs.entities.concretes.ProgLanguage;

@RestController
@RequestMapping("api/progLanguages")

public class ProgLanguagesController {
	private ProgLanguageService progLanguageService;

	public ProgLanguagesController(ProgLanguageService progLanguageService) {
		super();
		this.progLanguageService = progLanguageService;
	}
	
	@GetMapping("/getall")
	public List<ProgLanguage> getAll(){
		return progLanguageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgLanguage getById(int id){
		return progLanguageService.getById(id);
	}
	
	@PostMapping
	public void add(ProgLanguage progLanguage){
		 progLanguageService.add(progLanguage);
	}
	@PutMapping
	public void update(ProgLanguage progLanguage){
		 progLanguageService.update(progLanguage);
	}
	
	@DeleteMapping
	public void delete(int id){
		 progLanguageService.delete(id);
	}
}
