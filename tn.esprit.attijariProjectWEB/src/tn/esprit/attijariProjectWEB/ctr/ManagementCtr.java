package tn.esprit.attijariProjectWEB.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijatiProject.services.interfaces.ManagementServicesLocal;

@ManagedBean
@SessionScoped
public class ManagementCtr {
	// models
	private User user = new User();

	// injection
	@EJB
	private ManagementServicesLocal managementServicesLocal;

	// methods
	public String doAddUser() {
		managementServicesLocal.addUser(user);
		return "ok";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
