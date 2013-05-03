package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;


@Local
public interface ActionDaoLocal extends IDaoGenerique<Action>
		 {

	

	Action findAction(int idAction);

	List<Action> findAllAction();

}
