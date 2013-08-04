package tn.esprit.attijariProject.services.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoRemote;

/**
 * Session Bean implementation class UserDao
 */
@Stateless
public class UserDao implements UserDaoRemote, UserDaoLocal {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void creer(User t) {
		entityManager.persist(t);

	}

	@Override
	public void modifier(User t) {
		System.out.println("wsel");
		System.out.println(t.getFirstName());
		entityManager.merge(t);

	}

	@Override
	public void supprimer(User t) {
		entityManager.remove(entityManager.merge(t));
	}

	@Override
	public User findUser(int idUser) {
		return entityManager.find(User.class, idUser);
	}

	@Override
	public List<User> findAllUsers() {

		return entityManager.createQuery("select u from User u")
				.getResultList();
	}

	@Override
	public User finfUserByMatricule(Integer matricule) {

		return entityManager.find(User.class, matricule);
	}
	public User finfUserById(Integer id) {

		return entityManager.find(User.class, id);
	}

}
