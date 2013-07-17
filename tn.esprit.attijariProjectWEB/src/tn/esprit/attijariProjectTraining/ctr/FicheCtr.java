package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.interfaces.FicheDaoLocal;

@ManagedBean
@SessionScoped
public class FicheCtr {



	@EJB
	private Fiche fiche = new Fiche();
	private List<Fiche> fiches = new ArrayList<Fiche>();
	private FicheDaoLocal ficheDaoLocal;

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

	public List<Fiche> getFiches() {
		return fiches;
	}

	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}

	public String doAddFiche() {
	
	
			ficheDaoLocal.creer(fiche);
			 return "";
		

	}

}
