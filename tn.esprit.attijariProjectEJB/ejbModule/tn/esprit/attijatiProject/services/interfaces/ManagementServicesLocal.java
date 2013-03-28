package tn.esprit.attijatiProject.services.interfaces;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.User;

@Local
public interface ManagementServicesLocal {
	boolean addUser(User user);
}
