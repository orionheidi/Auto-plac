package jwd.wafepa.web.dto;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jwd.wafepa.model.Model;

public class AutomobilDTO {

	private Long id;
	
	private int godiste;
	
	private int kilometraza;
	
	private int cena;
	

	private ModelDTO model;
	
	


	public AutomobilDTO() {
		super();
	}




	public AutomobilDTO(Long id, int godiste, int kilometraza, int cena) {
		super();
		this.id = id;
		this.godiste = godiste;
		this.kilometraza = kilometraza;
		this.cena = cena;
	}




	public AutomobilDTO(int godiste, int kilometraza, int cena, ModelDTO model) {
		super();
		this.godiste = godiste;
		this.kilometraza = kilometraza;
		this.cena = cena;
		this.model = model;
	}




	public AutomobilDTO(Long id, int godiste, int kilometraza, int cena,
			ModelDTO model) {
		super();
		this.id = id;
		this.godiste = godiste;
		this.kilometraza = kilometraza;
		this.cena = cena;
		this.model = model;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public int getGodiste() {
		return godiste;
	}




	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}




	public int getKilometraza() {
		return kilometraza;
	}




	public void setKilometraza(int kilometraza) {
		this.kilometraza = kilometraza;
	}




	public int getCena() {
		return cena;
	}




	public void setCena(int cena) {
		this.cena = cena;
	}




	public ModelDTO getModel() {
		return model;
	}




	public void setModel(ModelDTO model) {
		this.model = model;
	}
	
	
}
