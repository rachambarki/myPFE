package tn.esprit.attijariProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.attijariProject.entities.Operateur;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoRemote;

public class tesddUser {

	/**
	 * @param args
	 * @throws NamingException
	 */
	public static void main(String[] args) throws NamingException {

		Context context = new InitialContext();
		UserDaoRemote userDaoRemote = (UserDaoRemote) context
				.lookup("tn.esprit.attijariProjectEAR/tn.esprit.attijariProjectEJB/UserDao!tn.esprit.attijariProject.services.dao.interfaces.UserDaoRemote");

		Operateur operateur = new Operateur();
		operateur.setLogin("rasha");
		operateur.setMatricule(1243);

		userDaoRemote.creer(operateur);

	}
}
