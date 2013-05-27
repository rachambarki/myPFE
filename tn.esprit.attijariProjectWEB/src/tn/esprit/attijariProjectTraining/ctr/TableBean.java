package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoLocal;

@ManagedBean
@SessionScoped
public class TableBean implements Serializable {
	private List<User> users = new ArrayList<User>();

	@EJB
	private UserDaoLocal userDaoLocal;

	public List<User> getUsers() {
		users = userDaoLocal.findAllUsers();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void onEdit(RowEditEvent event) {
		User ff = (User) event.getObject();

		System.out.println(ff.getFirstName());
		userDaoLocal.modifier((User) event.getObject());
		FacesMessage msg = new FacesMessage("Car Edited",
				((User) event.getObject()).getFirstName());
		FacesContext.getCurrentInstance().validationFailed();

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Car Cancelled",
				((User) event.getObject()).getFirstName());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
