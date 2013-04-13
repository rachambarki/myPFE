package tn.esprit.attijariProject.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: Operateur
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Operateur extends User implements Serializable {

	private String opateurFonction;
	private static final long serialVersionUID = 1L;

	public Operateur() {
		super();
	}

	public String getOpateurFonction() {
		return this.opateurFonction;
	}

	public void setOpateurFonction(String opateurFonction) {
		this.opateurFonction = opateurFonction;
	}

}
