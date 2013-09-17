package tn.esprit.attijariProjectTraining.ctr;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.entities.Traitement;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.TraitementDaoLocal;

@ManagedBean
@RequestScoped
public class planning {
	@EJB
	PlanningDaoLocal planningDaoLocal;
	private Planning planning = new Planning();
	TraitementDaoLocal traitementDaoLocal;
	private Traitement traitement;
	private List<Traitement> selectedTr;
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

	public String doAddTraitement() {
		traitement.setEtat(eta);
		traitement.sethExec(hEc);
		traitement.setMontant(mont);
		traitement.setTraitementMatricule(traitementMa);
		traitement.setNbreIn(nbreI);
		traitement.setTraitementDate(traitementD);
		System.out.println("traitement wsell");
		traitementDaoLocal.creer(traitement);
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

}
