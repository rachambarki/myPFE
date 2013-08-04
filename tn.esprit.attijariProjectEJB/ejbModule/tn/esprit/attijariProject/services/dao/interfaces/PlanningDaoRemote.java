package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Remote

public interface PlanningDaoRemote  extends IDaoGenerique<Planning>{



Planning findPl(int idPlanning );

	List<Planning> findAllPl();

}
