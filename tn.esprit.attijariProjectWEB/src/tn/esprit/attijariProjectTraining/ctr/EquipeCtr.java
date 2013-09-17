package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.attijariProject.entities.Equipe;
import tn.esprit.attijariProject.services.dao.interfaces.EquipeDaoLocal;

@ManagedBean
@SessionScoped
public class EquipeCtr {


	@EJB
	
	EquipeDaoLocal equipeDaoLocal;
	private Equipe equipe = new Equipe();
	private List<Equipe> equipes = new ArrayList<Equipe>();
	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	public String doAddEquipe() {

		String retour = "";
		try {
			equipeDaoLocal.creer(equipe);
		} catch (Exception e) {
			retour = "ma zedech equipe";
		}
		return retour;

	}
}
