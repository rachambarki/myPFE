package tn.esprit.attijariProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoRemote;

public class testaddAction {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ActionDaoRemote actionDaoRemote = (ActionDaoRemote) context
				.lookup("tn.esprit.attijariProjectEAR/tn.esprit.attijariProjectEJB/ActionDao!tn.esprit.attijariProject.services.dao.interfaces.ActionDaoRemote");

		Action action = new Action();
		actionDaoRemote.creer(action);
		action.setNameAction("injection AVA rasha");
		action.setVerification("OK");
	}

}
