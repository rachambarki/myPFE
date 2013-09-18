package tn.esprit.attijariProject.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_PLANNING")
public class Planning implements Serializable {
	private List<Fiche> listfiche;
	private List<Traitement> traitements;

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

	@OneToMany(mappedBy = "planning", cascade = CascadeType.ALL)
	public List<Traitement> getTraitements() {
		return traitements;
	}

	public void setTraitements(List<Traitement> traitements) {
		this.traitements = traitements;
	}

	@OneToMany(mappedBy = "planning")
	public List<Fiche> getListfiche() {
		return listfiche;
	}

	public void setListfiche(List<Fiche> listfiche) {
		this.listfiche = listfiche;
	}

	private int idPlanning;
	private int montant;
	private boolean Etat;

	// public void linkFichtoTraitement(List<Fiche> fiches) {
	// this.listfiche = fiches;
	// for (Fiche f : fiches) {
	//
	// f.setTraitement(this);
	// }
	//
	// }
	public void linkTraitementToPlanning(List<Traitement> traitementss) {
		this.traitements = traitementss;
		for (Traitement t : traitementss) {
			t.setPlanning(this);
		}

	}

}
