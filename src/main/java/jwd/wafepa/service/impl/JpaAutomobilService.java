package jwd.wafepa.service.impl;

import javax.transaction.Transactional;

import jwd.wafepa.model.Activity;
import jwd.wafepa.model.Automobil;
import jwd.wafepa.repository.AutomobilRepository;
import jwd.wafepa.repository.BookRepository;
import jwd.wafepa.service.AutomobilService;
import jwd.wafepa.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JpaAutomobilService  implements AutomobilService {

	@Autowired
	private AutomobilRepository automobilRepository;
	
	@Override
	public Automobil save(Automobil automobil) {
		return automobilRepository.save(automobil);
	}

	@Override
	public Page<Automobil> findAll(int page) {

		return automobilRepository.findAll(new PageRequest(page, 10));
	}

	@Override
	public Automobil findOne(Long id) {
		
		return automobilRepository.findOne(id);
	}

	@Override
	public Automobil delete(Long id) {
		Automobil a = automobilRepository.findOne(id);
		if(a == null){
			throw new IllegalArgumentException("Tried to delete"
					+ "non-existant activity");
		}
		automobilRepository.delete(a);
		return a;
	}

}
