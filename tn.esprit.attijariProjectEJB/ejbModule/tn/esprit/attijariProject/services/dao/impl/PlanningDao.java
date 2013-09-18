package tn.esprit.attijariProject.services.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoRemote;

@Stateless
public class PlanningDao implements PlanningDaoLocal, PlanningDaoRemote {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Planning findPl(int idPlanning) {

		return entityManager.find(Planning.class, idPlanning);
	}

	@Override
	public List<Planning> findAllPl() {

		return entityManager.createQuery("select p from Planning p").getResultList();
	}

	@Override
	public void creer(Planning t) {
		entityManager.merge(t);

	}

	@Override
	public void modifier(Planning t) {
		entityManager.merge(t);

	}

	@Override
	public void supprimer(Planning t) {
		entityManager.remove(entityManager.merge(t));

	}

	@Override
	public Planning finPlanningByEtat(boolean etat) {
		return entityManager.find(Planning.class, etat);

	}

}
