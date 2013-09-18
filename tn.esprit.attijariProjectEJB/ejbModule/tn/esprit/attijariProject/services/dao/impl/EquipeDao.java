package tn.esprit.attijariProject.services.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.attijariProject.entities.Equipe;
import tn.esprit.attijariProject.services.dao.interfaces.EquipeDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.EquipeDaoRemote;

@Stateless
public class EquipeDao implements EquipeDaoLocal, EquipeDaoRemote {
	@PersistenceContext
	private EntityManager entityManager;

		public List<Equipe> listAllEquipe() {
		

		return entityManager.createQuery("select e from Equipe e").getResultList();
	}

	@Override
	public Equipe findEquipe(int idEquipe) {

		return entityManager.find(Equipe.class, idEquipe);
	}

	@Override
	public void creer(Equipe t) {
	entityManager.persist(t);
	}

	@Override
	public void modifier(Equipe t) {
		entityManager.merge(t);
		
	}

	@Override
	public void supprimer(Equipe t) {
entityManager.remove(entityManager.merge(t));
		
	}
}
