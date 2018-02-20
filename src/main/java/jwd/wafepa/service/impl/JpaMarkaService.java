package jwd.wafepa.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import jwd.wafepa.model.Marka;
import jwd.wafepa.repository.AutomobilRepository;
import jwd.wafepa.repository.MarkaRepository;
import jwd.wafepa.service.AutomobilService;
import jwd.wafepa.service.MarkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JpaMarkaService  implements MarkaService{

	@Autowired
	private MarkaRepository markaRepository;
	
	@Override
	public List<Marka> findAll() {
		
		return markaRepository.findAll();
	}

	@Override
	public Marka findOne(Long id) {
		
		return markaRepository.findOne(id);
	}

	@Override
	public Marka save(Marka marka) {
	
		return markaRepository.save(marka);
	}

}
