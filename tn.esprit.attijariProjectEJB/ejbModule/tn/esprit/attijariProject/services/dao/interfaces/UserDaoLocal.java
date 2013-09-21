package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Local
public interface UserDaoLocal extends IDaoGenerique<User> {
	User findUser(int idUser);

	List<User> findAllUsers();
	User finfUserByMatricule(Integer matricule);
	User finfUserById(Integer id);
	User finfUserByName(String name);
	

}
