package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Remote
public interface UserDaoRemote extends IDaoGenerique<User> {
	User findUser(int idUser);

	List<User> findAllUsers();
}
