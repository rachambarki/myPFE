package tn.esprit.attijariProject.services.business.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.business.interfaces.AuthenticationServiceLocal;
import tn.esprit.attijariProject.services.business.interfaces.AuthenticationServiceRemote;

/**
 * Session Bean implementation class AuthenticationService
 */
@Stateless
public class AuthenticationService implements AuthenticationServiceRemote,
		AuthenticationServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public AuthenticationService() {
		// TODO Auto-generated constructor stub
	}

	public User authenticate(Integer login, String password) {
		User found = null;
		String jpql = "select u from User u where u.matricule=:login and u.password=:password";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("login", login);
		query.setParameter("password", password);
		try {
			found = (User) query.getSingleResult();
		} catch (Exception ex) {
		}
		return found;
	}
}
