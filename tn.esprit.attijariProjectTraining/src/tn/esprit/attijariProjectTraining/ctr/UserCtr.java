package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoLocal;

@ManagedBean
@SessionScoped
public class UserCtr {
	private User user = new User();
	private List<User> users = new ArrayList<User>();
	@EJB
	UserDaoLocal userDaoLocal;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		users = userDaoLocal.findAllUsers();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
