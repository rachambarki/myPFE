package tn.esprit.attijariProject.services.business.interfaces;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.User;

@Local
public interface AuthenticationServiceLocal {

	User authenticate(Integer login, String password);
}
