package tn.esprit.attijariProject.services.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.Traitement;
import tn.esprit.attijariProject.services.dao.interfaces.TraitementDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.TraitementDaoRemote;

@Stateless
public class TraitementDao implements TraitementDaoLocal, TraitementDaoRemote {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void creer(Traitement t) {
		entityManager.persist(t);

	}

	@Override
	public void modifier(Traitement t) {
		entityManager.merge(t);

	}

	@Override
	public void supprimer(Traitement t) {
		entityManager.remove(entityManager.merge(t));

	}

	@Override
	public Traitement findTraitement(int idTraitement) {

		return entityManager.find(Traitement.class, idTraitement);
	}

	@Override
	public List<Traitement> findAllTraitement() {

		return entityManager.createQuery("select t from Traitement t")
				.getResultList();
	}

}
