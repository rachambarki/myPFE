package tn.esprit.attijariProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.esprit.attijariProject.entities.Administrateur;
import tn.esprit.attijariProject.entities.Operateur;
import tn.esprit.attijatiProject.services.interfaces.ManagementServicesRemote;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.Input;

public class TestReelPlatform {
	private Context context;
	private ManagementServicesRemote proxy;

	@Before
	public void setUp() throws Exception {
		context = new InitialContext();
		proxy = (ManagementServicesRemote) context
				.lookup("ejb:/tn.esprit.attijariProjectEJB/ManagementServices!tn.esprit.attijatiProject.services.interfaces.ManagementServicesRemote");
	}

	@Test
	public void testAddUser() {
		Operateur operateur = new Operateur();
		Assert.assertTrue(proxy.addUser(operateur));
		//Administrateur administrateur = new Administrateur();
		//Assert.assertTrue(proxy.addUser(administrateur));
		
	}
//	@Test
//
//	public void testAddAction() {
//		Action action = new Action() 	;	
//		Assert.assertTrue(proxy.addAction(action));
//	}

}
