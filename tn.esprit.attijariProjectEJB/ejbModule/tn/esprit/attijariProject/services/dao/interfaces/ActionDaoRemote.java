package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.Action;

@Remote

public interface ActionDaoRemote {


	

	Action findAction(int idAction);

List<Action> findAllAction();

}
