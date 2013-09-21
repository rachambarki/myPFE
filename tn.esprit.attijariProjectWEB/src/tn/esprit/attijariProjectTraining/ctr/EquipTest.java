package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import tn.esprit.attijariProject.entities.Equipe;
import tn.esprit.attijariProject.services.dao.interfaces.EquipeDaoLocal;

@ManagedBean
@SessionScoped
public class EquipTest {

	@EJB
	EquipeDaoLocal equipeDaoLocal;
	private List<SelectItem> categories;
	private String selection;

	private Equipe equipe = new Equipe();
	private List<Equipe> equipes = new ArrayList<Equipe>();

	@PostConstruct
	public void init() {
		categories = new ArrayList<SelectItem>();

		SelectItemGroup group1 = new SelectItemGroup("Group 1");
		SelectItemGroup group2 = new SelectItemGroup("Group 2");

		categories.add(group1);
		categories.add(group2);
	}

	public int getIdEqu() {
		return idEqu;
	}

	public void setIdEqu(int idEqu) {
		this.idEqu = idEqu;
	}

	public String getNomEqu() {
		return nomEqu;
	}

	public void setNomEqu(String nomEqu) {
		this.nomEqu = nomEqu;
	}

	public String getDescEqu() {
		return descEqu;
	}

	public void setDescEqu(String descEqu) {
		this.descEqu = descEqu;
	}

	private int idEqu;
	private String nomEqu;
	private String descEqu;

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public List<Equipe> getEquipes() {
		equipes = equipeDaoLocal.listAllEquipe();
		System.out.println("equipe wesl");
		return equipes;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}

	// public String doAddEquipe() {
	//
	// String retour = "";
	// try {
	// equipeDaoLocal.creer(equipe);
	// } catch (Exception e) {
	// retour = "ma zedech equipe";
	// }
	// return retour;
	//
	// }

	public String doAddEquipe() {
		equipe.setNomEquipe(nomEqu);
		System.out.println("equipe wsell");

		equipeDaoLocal.modifier(equipe);
		return "";

	}

	public List<SelectItem> getCategories() {
		return categories;
	}

	public void setCategories(List<SelectItem> categories) {
		this.categories = categories;
	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

}
