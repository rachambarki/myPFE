package tn.esprit.attijariProject.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PLANNING")
public class Planning implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	public int getIdPlanning() {
		return idPlanning;
	}
	public void setIdPlanning(int idPlanning) {
		this.idPlanning = idPlanning;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public boolean isEtat() {
		return Etat;
	}
	public void setEtat(boolean etat) {
		Etat = etat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int idPlanning;
	private int montant;
	private boolean Etat;

}
