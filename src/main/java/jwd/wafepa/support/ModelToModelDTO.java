package jwd.wafepa.support;

import java.util.ArrayList;
import java.util.List;

import jwd.wafepa.model.Automobil;
import jwd.wafepa.model.Model;
import jwd.wafepa.web.dto.AutomobilDTO;
import jwd.wafepa.web.dto.ModelDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ModelToModelDTO  implements Converter<Model, ModelDTO> {

	@Autowired
	MarkaToMarkaDTO toDto;
	
	@Override
	public ModelDTO convert(Model model) {
		return new ModelDTO(model.getId(),model.getNaziv(),toDto.convert(model.getMarka()));
	}

	public List<ModelDTO> convert(List<Model> models){
		List<ModelDTO> ret = new ArrayList<>();
		
		for(Model model: models){
			ret.add(convert(model));
		}
		
		return ret;
	}

}
