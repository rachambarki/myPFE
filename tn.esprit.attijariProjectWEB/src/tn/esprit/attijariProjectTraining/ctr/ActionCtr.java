package tn.esprit.attijariProjectTraining.ctr;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoLocal;

@ManagedBean
@RequestScoped
public class ActionCtr {
	// private Date date;
	@EJB
	// java.sql.Date date1=new java.sql.Date(date.getTime());
	// public string goto(){
	// return "nompage.xhtml"
	// }
	ActionDaoLocal actionDaoLocal;
	private Action action = new Action();
	private List<Action> filtredAct;

	public String getNameAction() {
		return nameAction;
	}

	public void setNameAction(String nameAction) {
		this.nameAction = nameAction;
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

	private String nameAction;
	private String modeOperatoire;
	private Date heureDebut;
	private Date heuref;
	private String verifi;

	public ActionDaoLocal getActionDaoLocal() {
		return actionDaoLocal;
	}

	public void setActionDaoLocal(ActionDaoLocal actionDaoLocal) {
		this.actionDaoLocal = actionDaoLocal;
	}

	public Action getAction2() {
		return action2;
	}

	public void setAction2(Action action2) {
		this.action2 = action2;
	}

	public List<Action> getActions2() {
		return actions2;
	}

	public void setActions2(List<Action> actions2) {
		this.actions2 = actions2;
	}

	private Action action2;
	private List<Action> actions2;

	private Action action1 = new Action();

	public String docreateAction() {
		action.setNameAction(nameAction);
		action.setHeureDebut(heureDebut);
		action.setModeOperatoire(modeOperatoire);
		action.setHeureFin(heuref);
		action.setVerification(verifi);
System.out.println("eeeee");
		actionDaoLocal.creer(action);
		return "";
	}

	public Action getAction1() {
		return action1;
	}

	public void setAction1(Action action1) {
		this.action1 = action1;
	}

	public ActionCtr() {
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Date getHeuref() {
		return heuref;
	}

	public void setHeuref(Date heuref) {
		this.heuref = heuref;
	}

	public String getVerifi() {
		return verifi;
	}

	public void setVerifi(String verifi) {
		this.verifi = verifi;
	}

	public List<Action> getFiltredAct() {
		return filtredAct;
	}

	public void setFiltredAct(List<Action> filtredAct) {
		this.filtredAct = filtredAct;
	}

}
