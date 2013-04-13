package tn.esprit.attijatiProject.services.interfaces;

import javax.ejb.Remote;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import tn.esprit.attijariProject.entities.User;

@Remote
public interface ManagementServicesRemote {

	boolean addUser(User user);

	boolean addAction(Action action);

}
