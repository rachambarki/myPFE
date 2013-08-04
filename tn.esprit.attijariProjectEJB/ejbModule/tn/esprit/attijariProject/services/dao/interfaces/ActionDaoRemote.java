package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Remote

public interface ActionDaoRemote  extends IDaoGenerique<Action>{


	

	Action findAction(int idAction);

List<Action> findAllAction();

}
