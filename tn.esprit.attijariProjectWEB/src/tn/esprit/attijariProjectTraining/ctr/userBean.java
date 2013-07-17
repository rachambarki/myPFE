package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoLocal;

@ManagedBean
@ViewScoped
public class userBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3904374693910023739L;
	@EJB
	private UserDaoLocal userDaoLocal;
	private User user = new User();

	private List<User> users = new ArrayList<User>();
	private boolean formDisplayed = false;

	public userBean() {
	}

	@PostConstruct
	public void doSaveUser() {
		userDaoLocal.creer(user);
		users = userDaoLocal.findAllUsers();

		formDisplayed = false;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public boolean isFormDisplayed() {
		return formDisplayed;
	}

	public void setFormDisplayed(boolean formDisplayed) {
		this.formDisplayed = formDisplayed;
	}

}
