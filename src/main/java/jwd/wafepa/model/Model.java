package jwd.wafepa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Model {

	@Id
	@GeneratedValue
	private Long id;
	
	
	private String naziv;
	

	@ManyToOne(fetch=FetchType.LAZY)
	private Marka marka;


	public Model() {
		super();
	}

	public Model(String naziv) {
		super();
		this.naziv = naziv;
	}


	public Model(String naziv, Marka marka) {
		super();
		this.naziv = naziv;
		this.marka = marka;
	}


	public Model(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}


	public Model(Long id, String naziv, Marka marka) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.marka = marka;
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


	public Marka getMarka() {
		return marka;
	}


	public void setMarka(Marka marka) {
		this.marka = marka;
	}


	@Override
	public String toString() {
		return "Model [id=" + id + ", naziv=" + naziv + ", marka=" + marka
				+ "]";
	}
	
	
}
