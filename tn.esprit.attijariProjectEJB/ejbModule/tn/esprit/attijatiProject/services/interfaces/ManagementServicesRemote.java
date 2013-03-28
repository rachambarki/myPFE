package tn.esprit.attijatiProject.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.User;

@Remote
public interface ManagementServicesRemote {

	boolean addUser(User user);

}
