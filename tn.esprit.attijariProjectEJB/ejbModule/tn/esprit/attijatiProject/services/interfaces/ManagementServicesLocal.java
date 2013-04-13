package tn.esprit.attijatiProject.services.interfaces;

import javax.ejb.Local;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import tn.esprit.attijariProject.entities.User;

@Local
public interface ManagementServicesLocal {
	boolean addUser(User user);
	boolean addAction(Action action);
}
