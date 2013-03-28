package tn.esprit.attijariProject.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import tn.esprit.attijariProject.entities.User;

/**
 * Entity implementation class for Entity: Administrateur
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Administrateur extends User implements Serializable {

	
	private String adminRole;
	private static final long serialVersionUID = 1L;

	public Administrateur() {
		super();
	}   
	public String getAdminRole() {
		return this.adminRole;
	}

	public void setAdminRole(String adminRole) {
		this.adminRole = adminRole;
	}
   
}
