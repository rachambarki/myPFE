package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoLocal;

@ManagedBean
@SessionScoped
public class PlanningCtr implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	// TraitementDaoLocal traitementDaoLocal;
	PlanningDaoLocal planningDaoLocal;

	// private Traitement traitement = new Traitement();
	private Planning planning = new Planning();

	// private List<Traitement> traitements = new ArrayList<Traitement>();
	private List<Planning> plannings = new ArrayList<Planning>();

	//
	// public List<Traitement> getTraitements() {
	// traitements = traitementDaoLocal.findAllTraitement();
	// System.out.println(traitements.size());
	// return traitements;
	// }
	//
	// public void setTraitements(List<Traitement> traitements) {
	// this.traitements = traitements;
	// }

	public String doAddTraitement() {
		String retour = "";
		try {
			planningDaoLocal.creer(planning);
		} catch (Exception e) {
			retour = "ma zedech trt";
		}
		return retour;

	}

	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}


	public List<Planning> getPlannings() {
		plannings = planningDaoLocal.findAllPl();
		System.out.println(plannings.size());
		return plannings;
	}

	public void setPlannings(List<Planning> plannings) {
		this.plannings = plannings;
	}

}
