package tn.esprit.attijariProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.interfaces.FicheDaoRemote;

public class testAddFiche {

	public static void main(String[] args) throws NamingException {
		

		Context context = new InitialContext();
		FicheDaoRemote ficheDaoRemote = (FicheDaoRemote) context
				.lookup("tn.esprit.attijariProjectEAR/tn.esprit.attijariProjectEJB/FicheDao!tn.esprit.attijariProject.services.dao.interfaces.FicheDaoRemote");

		Fiche fiche = new Fiche();
		ficheDaoRemote.creer(fiche);
		fiche.setFicheName("testFiche");
	}

}
