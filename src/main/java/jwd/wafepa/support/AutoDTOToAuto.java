package jwd.wafepa.support;

import java.util.ArrayList;
import java.util.List;









import jwd.wafepa.model.Automobil;
import jwd.wafepa.model.Book;
import jwd.wafepa.service.AutomobilService;
import jwd.wafepa.service.ModelService;
import jwd.wafepa.web.dto.AutomobilDTO;
import jwd.wafepa.web.dto.BookDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AutoDTOToAuto implements Converter<AutomobilDTO, Automobil> {
	@Autowired
	private AutomobilService automobilService;
	
	@Autowired
	private ModelService modelService;
	

	public Automobil convert(AutomobilDTO dto) {
		Automobil auto = new Automobil();
		if (dto.getId() != null) {
			auto = automobilService.findOne(dto.getId());
			if (auto == null) {
				throw new IllegalStateException("Tried to "
						+ "modify a non-existant auto");
			}
		}
		auto.setId(dto.getId());
		auto.setGodiste(dto.getGodiste());
		auto.setKilometraza(dto.getKilometraza());
		auto.setCena(dto.getCena());

		auto.setModel(modelService.findOne(dto.getModel().getId()));
		return auto;
	}
	
	public List<Automobil> convert (List<AutomobilDTO> dto){
		List<Automobil> auto = new ArrayList<>();
		
		for(AutomobilDTO dtos : dto){
			auto.add(convert(dtos));
		}
		
		return auto;
	}

}
