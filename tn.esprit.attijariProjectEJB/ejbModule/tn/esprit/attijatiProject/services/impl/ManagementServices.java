package tn.esprit.attijatiProject.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijatiProject.services.interfaces.ManagementServicesLocal;
import tn.esprit.attijatiProject.services.interfaces.ManagementServicesRemote;

import com.sun.corba.se.spi.orbutil.fsm.Action;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
public class ManagementServices implements ManagementServicesRemote,
		ManagementServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ManagementServices() {

	}

	@Override
	public boolean addUser(User user) {
		boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
			System.out.println("pb d'ajout user");
		}
		return b;
	}

	@Override
	public boolean addAction(Action action) {
		boolean b = false;
		try {
			entityManager.persist(action);
			b = true;
		} catch (Exception e) {
			System.out.println("pb d'ajout d'action");
		}
		return b;
	}

}
