package jwd.wafepa.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import jwd.wafepa.model.Model;
import jwd.wafepa.repository.AutomobilRepository;
import jwd.wafepa.repository.ModelRepository;
import jwd.wafepa.service.AutomobilService;
import jwd.wafepa.service.ModelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JpaModelService implements ModelService {
	
	@Autowired
	private ModelRepository modelRepository;
	

	@Override
	public List<Model> findAll() {
		
		return modelRepository.findAll();
	}

	@Override
	public Model findOne(Long id) {
	
		return modelRepository.findOne(id);
	}

	@Override
	public Model save(Model model) {
		
		return modelRepository.save(model);
	}

	@Override
	public List<Model> findByMarkaId(Long markaId) {
		return modelRepository.findByMarkaId(markaId);
	}

	

}
