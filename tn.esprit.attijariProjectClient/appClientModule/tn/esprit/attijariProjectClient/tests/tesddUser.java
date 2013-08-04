package tn.esprit.attijariProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.attijariProject.entities.Administrateur;
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
		Administrateur administrateur = new Administrateur();
		Operateur operateur = new Operateur();
	//	operateur.setMatricule("23456");

		userDaoRemote.creer(operateur);
	//	administrateur.setMatricule("6789");
		administrateur.setFirstName("med ali cc");
		administrateur.setLastName("guebci");
		administrateur.setMailAdress("w@attijari.com");
		administrateur.setPassword("06491007");
		//administrateur.setEquipe("soir");
		//administrateur.setAdminRole("informatique");

		userDaoRemote.creer(administrateur);

	}
}
