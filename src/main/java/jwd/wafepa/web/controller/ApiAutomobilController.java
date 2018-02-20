package jwd.wafepa.web.controller;

import java.util.List;

import jwd.wafepa.model.Activity;
import jwd.wafepa.model.Automobil;
import jwd.wafepa.model.Book;
import jwd.wafepa.service.AutomobilService;
import jwd.wafepa.service.BookService;
import jwd.wafepa.support.AutoDTOToAuto;
import jwd.wafepa.support.AutoToAutoDTO;
import jwd.wafepa.support.BookDTOtoBook;
import jwd.wafepa.support.BookToBookDTO;



import jwd.wafepa.web.dto.ActivityDTO;
import jwd.wafepa.web.dto.AutomobilDTO;
import jwd.wafepa.web.dto.BookDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/automobili")
public class ApiAutomobilController {

	@Autowired
	AutomobilService automobilService;
	
	@Autowired
	AutoToAutoDTO toDto;;

	@Autowired
	AutoDTOToAuto toAuto;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<AutomobilDTO>> getAutomobili(
			@RequestParam(value = "page", defaultValue = "0") int page) {

	
		Page<Automobil> auti;

		auti = automobilService.findAll(page);
		
		auti.getTotalPages();
		HttpHeaders headers = new HttpHeaders();
		headers.add("totalPages", auti.getTotalPages()+"");
		return new ResponseEntity<>(toDto.convert(auti.getContent()),headers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<AutomobilDTO> getAuto(@PathVariable Long id) {
		Automobil auto = automobilService.findOne(id);
		if (auto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDto.convert(auto), HttpStatus.OK);
	}
 
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<AutomobilDTO> add(@RequestBody AutomobilDTO newAuto) {

		Automobil savedAuto = automobilService.save(
				toAuto.convert(newAuto));

		return new ResponseEntity<>(toDto.convert(savedAuto), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<AutomobilDTO> edit(@RequestBody AutomobilDTO auto,
			@PathVariable Long id) {

		if (id != auto.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Automobil persisted = automobilService.save(toAuto.convert(auto));

		return new ResponseEntity<>(toDto.convert(persisted), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<AutomobilDTO> delete(@PathVariable Long id) {
		Automobil deleted = automobilService.delete(id);

		return new ResponseEntity<>(toDto.convert(deleted), HttpStatus.OK);
	}



}
