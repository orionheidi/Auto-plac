package jwd.wafepa.service;

import jwd.wafepa.model.Automobil;
import jwd.wafepa.model.Book;

import org.springframework.data.domain.Page;

public interface AutomobilService {
	
	 Automobil save(Automobil automobil);

	 Page<Automobil> findAll(int page);

	 Automobil findOne(Long id);
	

	 Automobil delete(Long id); 
}
