package jwd.wafepa.service;

import java.util.List;

import jwd.wafepa.model.Author;
import jwd.wafepa.model.Model;

public interface ModelService {

	 List<Model> findAll(); 
	
	 Model findOne( Long id);
	 
	 Model save(Model model);
	 

	List<Model> findByMarkaId(Long markaId);
	
}
