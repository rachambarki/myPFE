package tn.esprit.attijariProject.entities;

import java.io.Serializable;
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
@Table(name="T_FICHE")
public class Fiche implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ficheId;
	private String ficheName;
	private Date dateDeTraitement;
	private String fichePeriodicity;
	private String descriptionFiche;
	private Date dureeTraitement;
	private Date journee;
	private String observation;
	private String ordereDeLancement;// ordre dexecution
	private List<Action> listActions;
	private Traitement traitement;
	private Planning planning;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getFicheId() {
		return ficheId;
	}

	public void setFicheId(int ficheId) {
		this.ficheId = ficheId;
	}

	public String getFicheName() {
		return ficheName;
	}

	public void setFicheName(String ficheName) {
		this.ficheName = ficheName;
	}

	public Date getDateDeTraitement() {
		return dateDeTraitement;
	}

	public void setDateDeTraitement(Date dateDeTraitement) {
		this.dateDeTraitement = dateDeTraitement;
	}

	public String getFichePeriodicity() {
		return fichePeriodicity;
	}

	public void setFichePeriodicity(String fichePeriodicity) {
		this.fichePeriodicity = fichePeriodicity;
	}

	public String getDescriptionFiche() {
		return descriptionFiche;
	}

	public void setDescriptionFiche(String descriptionFiche) {
		this.descriptionFiche = descriptionFiche;
	}

	public Date getDureeTraitement() {
		return dureeTraitement;
	}

	public void setDureeTraitement(Date dureeTraitement) {
		this.dureeTraitement = dureeTraitement;
	}

	public Date getJournee() {
		return journee;
	}

	public void setJournee(Date journee) {
		this.journee = journee;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getOrdereDeLancement() {
		return ordereDeLancement;
	}

	public void setOrdereDeLancement(String ordereDeLancement) {
		this.ordereDeLancement = ordereDeLancement;
	}

	@OneToMany(mappedBy = "fiche")
	//oneToMany or @ManyToone
	public List<Action> getListActions() {
		return listActions;
	}

	public void setListActions(List<Action> listActions) {
		this.listActions = listActions;
	}

	@ManyToOne
	public Traitement getTraitement() {
		return traitement;
	}

	public void setTraitement(Traitement traitement) {
		this.traitement = traitement;
	}
	@ManyToOne
	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

}
