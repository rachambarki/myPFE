package tn.esprit.attijatiProject.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijatiProject.services.interfaces.ManagementServicesLocal;
import tn.esprit.attijatiProject.services.interfaces.ManagementServicesRemote;

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
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addUser(User user) {
		boolean b = false;
		try {
			entityManager.persist(user);
			b=true;
		} catch (Exception e) {
			System.out.println("pb d'ajout");
		}
		return b;
	}

}
