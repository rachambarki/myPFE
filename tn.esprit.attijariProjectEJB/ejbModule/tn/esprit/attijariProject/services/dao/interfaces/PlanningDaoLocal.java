package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Local
public interface PlanningDaoLocal extends IDaoGenerique<Planning> {

	Planning findPl(int idPlanning);

	List<Planning> findAllPl();

	// User finfUserByMatricule(Integer matricule);
	Planning finPlanningByEtat(boolean etat);

}
