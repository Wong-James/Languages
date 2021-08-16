package com.james.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.james.languages.models.Language;
import com.james.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	//Get all languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	
	//Create a language
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}
	
	//Get language by ID
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	//delete a language
	public void deleteById(Long id) {
		languageRepository.deleteById(id);
	}
	//edit a language
	public Language updateLanguage(Language language) {
		return languageRepository.save(language);
			
	}
	

}
