package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.entities.Traitement;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.TraitementDaoLocal;

@ManagedBean
@SessionScoped
public class planning {

	@EJB
	PlanningDaoLocal planningDaoLocal;
	private Planning planning = new Planning();
	private boolean etat;

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	private int montant;
	@EJB
	TraitementDaoLocal traitementDaoLocal;
	private Traitement traitement;
	private List<Traitement> selectedTr = new ArrayList<Traitement>();

	private DataModel<Planning> dataModelPlannings = new ListDataModel<Planning>();
	private DataModel<Traitement> dataModelTraitements = new ListDataModel<Traitement>();

	public DataModel<Traitement> getDataModelTraitements() {
		dataModelTraitements.setWrappedData(traitementDaoLocal
				.findAllTraitement());

		return dataModelTraitements;
	}

	public void setDataModelTraitements(
			DataModel<Traitement> dataModelTraitements) {
		this.dataModelTraitements = dataModelTraitements;
	}

	public DataModel<Planning> getDataModelPlannings() {
		dataModelPlannings.setWrappedData(planningDaoLocal.findAllPl());
		return dataModelPlannings;
	}

	public void setDataModelPlannings(DataModel<Planning> dataModelPlannings) {
		this.dataModelPlannings = dataModelPlannings;
	}

	private int traitementMa;

	private Date traitementD;

	public int getTraitementMa() {
		return traitementMa;
	}

	public void setTraitementMa(int traitementMa) {
		this.traitementMa = traitementMa;
	}

	public Date getTraitementD() {
		return traitementD;
	}

	public void setTraitementD(Date traitementD) {
		this.traitementD = traitementD;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public Date gethEc() {
		return hEc;
	}

	public void sethEc(Date hEc) {
		this.hEc = hEc;
	}

	public int getNbreO() {
		return nbreO;
	}

	public void setNbreO(int nbreO) {
		this.nbreO = nbreO;
	}

	public int getNbreI() {
		return nbreI;
	}

	public void setNbreI(int nbreI) {
		this.nbreI = nbreI;
	}

	public int getMont() {
		return mont;
	}

	public void setMont(int mont) {
		this.mont = mont;
	}

	private String eta;
	private Date hEc;
	private int nbreO;
	private int nbreI;
	private int mont;

	public int getMontantpla() {
		return montantpla;
	}

	public void setMontantpla(int montantpla) {
		this.montantpla = montantpla;
	}

	public boolean isEtatpla() {
		return Etatpla;
	}

	public void setEtatpla(boolean etatpla) {
		Etatpla = etatpla;
	}

	private int montantpla;
	private boolean Etatpla;

	public String docreatePlanning() {
		planning.setEtat(Etatpla);
		planning.setMontant(montantpla);
		System.out.println("plann");
		planningDaoLocal.creer(planning);

		return "";
	}

	public String doAddPlanning() {

		planning.setEtat(etat);
		planning.setMontant(montant);
		planning.linkTraitementToPlanning(selectedTr);
		planningDaoLocal.creer(planning);
		System.out.println("planning Ajouté avc succes");
		return "";

	}

	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

	public List<Traitement> getSelectedTr() {
		return selectedTr;
	}

	public void setSelectedTr(List<Traitement> selectedTr) {
		this.selectedTr = selectedTr;
	}

	public String doSomthing() {
		Traitement traitementTMP = dataModelTraitements.getRowData();
		System.out.println(traitementTMP.getTraitementId());
		selectedTr.add(traitementTMP);
		System.out.println(selectedTr.size());
		return "";

	}

	public Traitement getTraitement() {
		return traitement;
	}

	public void setTraitement(Traitement traitement) {
		this.traitement = traitement;
	}

}
