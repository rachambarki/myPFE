package tn.esprit.attijariProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.interfaces.FicheDaoRemote;

public class testAddFiche {

	public static void main(String[] args) throws NamingException {
		

		Context context = new InitialContext();
		FicheDaoRemote ficheDaoRemote = (FicheDaoRemote) context
				.lookup("tn.esprit.attijariProjectWEB/FicheDao!tn.esprit.attijariProject.services.dao.interfaces.FicheDaoRemote");

		
		
		
		Fiche fiche = new Fiche();
		fiche.setFicheName("barra ib3edni ...");
		
		Action action =new Action();
		action.setNameAction("faddedtni ");
		
		action.setFiche(fiche);
		
		
		ficheDaoRemote.creer(fiche);
	
	}

}
