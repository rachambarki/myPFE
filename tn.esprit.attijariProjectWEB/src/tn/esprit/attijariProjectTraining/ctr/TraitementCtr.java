package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.ArrayList;
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

	private Traitement traitement = new Traitement();

	private List<Traitement> traitements = new ArrayList<Traitement>();

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
		String retour = "";
		try {
			traitementDaoLocal.creer(traitement);
		} catch (Exception e) {
			retour = "ma zedech trt";
		}
		return retour;

	}

}
