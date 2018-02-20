package jwd.wafepa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Automobil {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int godiste;
	
	private int kilometraza;
	
	private int cena;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Model model;

	public Automobil() {
		super();
	}

	public Automobil(int godiste, int kilometraza, int cena, Model model) {
		super();
		this.godiste = godiste;
		this.kilometraza = kilometraza;
		this.cena = cena;
		this.model = model;
	}
	
	

	public Automobil(Long id, int godiste, int kilometraza, int cena) {
		super();
		this.id = id;
		this.godiste = godiste;
		this.kilometraza = kilometraza;
		this.cena = cena;
	}

	public Automobil(Long id, int godiste, int kilometraza, int cena,
			Model model) {
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

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Automobil [id=" + id + ", godiste=" + godiste
				+ ", kilometraza=" + kilometraza + ", cena=" + cena
				+ ", model=" + model + "]";
	}
	
	
	
	
}
