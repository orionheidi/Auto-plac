package jwd.wafepa.service;

import java.util.List;

import jwd.wafepa.model.Marka;

public interface MarkaService {
	
	 List<Marka> findAll(); 
		
	 Marka findOne( Long id);
	 
	 Marka save(Marka marka);
}
