package tn.esprit.attijariProjectTraining.ctr;

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
