package jwd.wafepa.web.controller;

import java.util.List;

import jwd.wafepa.model.Address;
import jwd.wafepa.model.Automobil;
import jwd.wafepa.model.Model;
import jwd.wafepa.service.AutomobilService;
import jwd.wafepa.service.ModelService;
import jwd.wafepa.support.AutoToAutoDTO;
import jwd.wafepa.support.ModelToModelDTO;
import jwd.wafepa.web.dto.AddressDTO;
import jwd.wafepa.web.dto.AutomobilDTO;
import jwd.wafepa.web.dto.ModelDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/modeli")
public class ApiModeliController {
	
	@Autowired
	ModelService modelService;
	
	@Autowired
	ModelToModelDTO toDto;;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<ModelDTO>> getModeli(
			@PathVariable Long markaId) {

		List<Model> models;
		
		if (markaId != null) {
			models = modelService.findByMarkaId(markaId);
		} else {
			models = modelService.findAll();
		}

		
		
		return new ResponseEntity<>(toDto.convert(models), HttpStatus.OK);
	}
	

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ModelDTO> get(@PathVariable Long id) {

		Model model = modelService.findOne(id);

		if (model == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDto.convert(model), HttpStatus.OK);
	}

}
