package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoLocal;

@ManagedBean
@ViewScoped
public class ActionCtr {
	private int idAction;
	public int getIdAction() {
		return idAction;
	}

	public void setIdAction(int idAction) {
		this.idAction = idAction;
	}

	public String getNameAction() {
		return NameAction;
	}

	public void setNameAction(String nameAction) {
		NameAction = nameAction;
	}

	public String getModeOperatoire() {
		return modeOperatoire;
	}

	public void setModeOperatoire(String modeOperatoire) {
		this.modeOperatoire = modeOperatoire;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public String getVerification() {
		return verification;
	}

	public void setVerification(String verification) {
		this.verification = verification;
	}

	private String NameAction;
	private String modeOperatoire;
	private Date heureDebut;
	private Date heureFin;
	private String verification;
	private Action action = new Action();
	private List<Action> actions = new ArrayList<Action>();
	private boolean displayForm;
	@EJB
	private ActionDaoLocal actionDaoLocal;

	public List<Action> getActions() {

		actions = actionDaoLocal.findAllAction();
		System.out.println(actions.size());
		return actions;
	}

	public String doUpdate() {
		displayForm = true;

		return "";
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public String doAddAction() {
		String retour = "";
		try {
			actionDaoLocal.creer(action);

		} catch (Exception e) {
			retour = "ma zedech action";
		}
		return retour;

	}

	public String doRemoveAction() {

		String retour = "";
		try {
			actionDaoLocal.supprimer(action);

		} catch (Exception e) {
			retour = "echec supression";
		}
		return retour;

	}

	public String doModifierAction() {

		String retour = "";
		try {
			actionDaoLocal.modifier(action);

		} catch (Exception e) {
			retour = "echec update";
		}
		return retour;

	}

	public boolean isDisplayForm() {
		return displayForm;
	}

	public void setDisplayForm(boolean displayForm) {
		this.displayForm = displayForm;
	}

}
