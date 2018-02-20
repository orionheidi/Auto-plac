package jwd.wafepa.support;

import java.util.ArrayList;
import java.util.List;

import jwd.wafepa.model.Author;
import jwd.wafepa.model.Marka;
import jwd.wafepa.web.dto.AuthorDTO;
import jwd.wafepa.web.dto.MarkaDTO;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MarkaToMarkaDTO implements Converter<Marka, MarkaDTO>{

	@Override
	public MarkaDTO convert(Marka marka) {
		return new MarkaDTO(marka.getId(), marka.getNaziv());
	}
	
	public List<MarkaDTO> convert(List<Marka> marks){
		List<MarkaDTO> ret = new ArrayList<>();
		
		for(Marka marka : marks){
			ret.add(convert(marka));
		}
		
		return ret;
	}
}
