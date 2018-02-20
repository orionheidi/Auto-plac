package jwd.wafepa.web.controller;


import java.util.List;

import jwd.wafepa.model.Marka;
import jwd.wafepa.model.Model;
import jwd.wafepa.service.MarkaService;
import jwd.wafepa.support.MarkaToMarkaDTO;
import jwd.wafepa.web.dto.MarkaDTO;
import jwd.wafepa.web.dto.ModelDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/marke")
public class ApiMarkaController {
	@Autowired
	private MarkaService markaService;
	
	@Autowired
	private MarkaToMarkaDTO toDto;
	
	

	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<MarkaDTO>> getMarke() {

		List<Marka> marke;

		marke = markaService.findAll();
		
		
		return new ResponseEntity<>(toDto.convert(marke), HttpStatus.OK);
	}
	
	
}
