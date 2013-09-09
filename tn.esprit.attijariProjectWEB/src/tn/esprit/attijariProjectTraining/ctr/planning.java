package tn.esprit.attijariProjectTraining.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoLocal;

@ManagedBean
@RequestScoped
public class planning {
	@EJB
	PlanningDaoLocal planningDaoLocal;
	private Planning planning = new Planning();

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

	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

}
