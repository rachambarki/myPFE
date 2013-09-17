package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.attijariProject.entities.Traitement;
import tn.esprit.attijariProject.services.dao.interfaces.TraitementDaoLocal;

@ManagedBean
@SessionScoped
public class TraitementCtr implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	TraitementDaoLocal traitementDaoLocal;
	private List<Traitement> filtredTrait;
	private List<Traitement> selectedTrait;
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

	private int traitementMa;

	private Date traitementD;
	private String eta;
	private Date hEc;
	private int nbreO;
	private int nbreI;
	private int mont;

	private Traitement traitement = new Traitement();

	private List<Traitement> traitements = new ArrayList<Traitement>();
	private List<Traitement> selected = new ArrayList<Traitement>();

	public Traitement getTraitement() {
		return traitement;
	}

	public void setTraitement(Traitement traitement) {
		this.traitement = traitement;
	}

	public List<Traitement> getTraitements() {
		traitements = traitementDaoLocal.findAllTraitement();
		System.out.println(traitements.size());
		return traitements;
	}

	public void setTraitements(List<Traitement> traitements) {
		this.traitements = traitements;
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

	public List<Traitement> getFiltredTrait() {
		return filtredTrait;
	}

	public void setFiltredTrait(List<Traitement> filtredTrait) {
		this.filtredTrait = filtredTrait;
	}

	public List<Traitement> getSelectedTrait() {
		return selectedTrait;
	}

	public void setSelectedTrait(List<Traitement> selectedTrait) {
		this.selectedTrait = selectedTrait;
	}

	public List<Traitement> getSelected() {
		return selected;
	}

	public void setSelected(List<Traitement> selected) {
		this.selected = selected;
	}

}
