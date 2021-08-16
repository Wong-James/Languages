package com.james.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.james.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	List<Language> findAll();
//	List<Language> findAllByDescriptionContaining(String search);
//	Long countByTitleContaining(String search);
//	Long deleteByNameStartingWith(String search);
	
}
