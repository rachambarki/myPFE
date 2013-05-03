package tn.esprit.attijariProject.services.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoRemote;


@Stateless
public class ActionDao implements ActionDaoLocal, ActionDaoRemote {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Action findAction(int idAction) {

		return entityManager.find(Action.class, idAction);
	}

	@Override
	public List<Action> findAllAction() {
		return null;

	//	return entityManager.createQuery("select a from Action a")
		//		.getResultList();
	}

	@Override
	public void creer(Action t) {
		entityManager.persist(t);

	}

	@Override
	public void modifier(Action t) {
		entityManager.merge(t);

	}

	@Override
	public void supprimer(Action t) {
		entityManager.remove(entityManager.merge(t));

	}

}
