package tn.esprit.attijariProjectTraining.ctr;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoLocal;

@ManagedBean
@RequestScoped
public class userCtr1 {

	private static final String Prenom = null;

	@EJB
	UserDaoLocal userDaoLocal;

	private User user1 = new User();

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public String docreateUser() {

		userDaoLocal.creer(user1);
		return "";
	}

	public userCtr1() {
	}

	public void savePerson(ActionEvent actionEvent) {
		String firstname = null;
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Welcome " + firstname + " " + Prenom + "!"));
	}

}
