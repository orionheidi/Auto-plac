package jwd.wafepa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Marka {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String naziv;
	
	@OneToMany(mappedBy="marka",cascade=CascadeType.REMOVE)
	private List<Model> modeli = new ArrayList<Model>();

	public Marka() {
		super();
	}

	public Marka(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}

	public Marka(String naziv, List<Model> modeli) {
		super();
		this.naziv = naziv;
		this.modeli = modeli;
	}

	public Marka(String naziv) {
		super();
		this.naziv = naziv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Model> getModeli() {
		return modeli;
	}

	public void setModeli(List<Model> modeli) {
		this.modeli = modeli;
	}

	@Override
	public String toString() {
		return "Marka [id=" + id + ", naziv=" + naziv + ", modeli=" + modeli
				+ "]";
	}
	
	
	

}
