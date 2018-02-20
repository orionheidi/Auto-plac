package jwd.wafepa.support;

import java.util.ArrayList;
import java.util.List;

import jwd.wafepa.model.Automobil;
import jwd.wafepa.model.Book;
import jwd.wafepa.web.dto.AutomobilDTO;
import jwd.wafepa.web.dto.BookDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
@Component
public class AutoToAutoDTO  implements Converter<Automobil, AutomobilDTO> {

	@Autowired
	ModelToModelDTO toDto;
	
	
	public AutomobilDTO convert(Automobil auto) {
		
		return new AutomobilDTO(auto.getId(),auto.getGodiste(), auto.getCena(),auto.getKilometraza(),toDto.convert(auto.getModel()));
	}

	public List<AutomobilDTO> convert(List<Automobil> autos){
		List<AutomobilDTO> ret = new ArrayList<>();
		
		for(Automobil auto : autos){
			ret.add(convert(auto));
		}
		
		return ret;
	}

}
