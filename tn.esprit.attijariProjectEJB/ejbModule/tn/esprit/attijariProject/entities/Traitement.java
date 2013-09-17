package tn.esprit.attijariProject.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_TRAITEMENT")
public class Traitement {
	private int traitementId;
	private int traitementMatricule;
	private List<Fiche> listfiche;
	private Date traitementDate;
	private String etat;
	private Date hExec;
	private int nbreOut;
	private int nbreIn;
	private int montant;
	private Planning planning;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getTraitementId() {
		return traitementId;
	}

	public void setTraitementId(int traitementId) {
		this.traitementId = traitementId;
	}

	public int getTraitementMatricule() {
		return traitementMatricule;
	}

	public void setTraitementMatricule(int traitementMatricule) {
		this.traitementMatricule = traitementMatricule;
	}

	@OneToMany(mappedBy = "traitement")
	public List<Fiche> getListfiche() {
		return listfiche;
	}

	public void setListfiche(List<Fiche> listfiche) {
		this.listfiche = listfiche;
	}

	public Date getTraitementDate() {
		return traitementDate;
	}

	public void setTraitementDate(Date traitementDate) {
		this.traitementDate = traitementDate;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date gethExec() {
		return hExec;
	}

	public void sethExec(Date hExec) {
		this.hExec = hExec;
	}

	public int getNbreOut() {
		return nbreOut;
	}

	public void setNbreOut(int nbreOut) {
		this.nbreOut = nbreOut;
	}

	public int getNbreIn() {
		return nbreIn;
	}

	public void setNbreIn(int nbreIn) {
		this.nbreIn = nbreIn;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	@ManyToOne
	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

	// public void linkActionsToFiche(List<Action> actions) {
	// this.listActions = actions;
	// for (Action c : actions) {
	// c.setFiche(this);
	//
	// }
	public void linkFichtoTraitement(List<Fiche> fiches) {
		this.listfiche = fiches;
		for (Fiche f : fiches) {

			f.setTraitement(this);
		}

	}
}
