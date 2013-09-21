package tn.esprit.attijariProject.services.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.interfaces.FicheDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.FicheDaoRemote;

@Stateless
public class FicheDao implements FicheDaoLocal, FicheDaoRemote {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void creer(Fiche t) {
		entityManager.persist(t);

	}

	@Override
	public void modifier(Fiche t) {
		entityManager.merge(t);

	}
	

	@Override
	public void supprimer(Fiche t) {
		entityManager.remove(entityManager.merge(t));

	}

	@Override
	public Fiche findFiche(int idFiche) {

		return entityManager.find(Fiche.class, idFiche);
	}

	@Override
	public List<Fiche> findAllFiche() {
	

		return entityManager.createQuery("select f from Fiche f").getResultList();

}

	
	public Fiche updateFiche(Fiche fiche) {
		return entityManager.merge(fiche);
	}
}