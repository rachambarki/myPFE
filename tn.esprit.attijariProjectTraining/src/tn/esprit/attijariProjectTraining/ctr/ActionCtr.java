package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoLocal;

@ManagedBean
@SessionScoped
public class ActionCtr {
	private Action action = new Action();
	private List<Action> actions = new ArrayList<Action>();
	private boolean displayForm;

	@EJB
	private ActionDaoLocal actionDaoLocal;

	public List<Action> getActions() {
		System.out.println(actions.size());
		actions = actionDaoLocal.findAllAction();
		return actions;
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

	public boolean isDisplayForm() {
		return displayForm;
	}

	public void setDisplayForm(boolean displayForm) {
		this.displayForm = displayForm;
	}

}
