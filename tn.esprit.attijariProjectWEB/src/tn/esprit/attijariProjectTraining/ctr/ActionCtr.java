package tn.esprit.attijariProjectTraining.ctr;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoLocal;

@ManagedBean
@RequestScoped
public class ActionCtr {

	@EJB
	
	ActionDaoLocal actionDaoLocal;
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

		actionDaoLocal.creer(action1);
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

}
