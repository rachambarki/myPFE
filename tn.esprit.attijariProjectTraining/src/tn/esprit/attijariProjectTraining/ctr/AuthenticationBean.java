package tn.esprit.attijariProjectTraining.ctr;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.attijariProject.entities.Administrateur;
import tn.esprit.attijariProject.entities.Operateur;
import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.business.interfaces.AuthenticationServiceLocal;

@ManagedBean
@SessionScoped
public class AuthenticationBean {

	private User user = new User();
	private  boolean loggedIn;
	@EJB
	private AuthenticationServiceLocal authenticationServiceLocal;
	private String userType;

	
	public String login(){
		String navigateTo = null;
		User found = authenticationServiceLocal.authenticate(user.getMatricule(), user.getPassword());
		if (found != null) {
			
			if (found instanceof Administrateur) {
				setUserType("Administrateur");
				navigateTo = "pages/admin/home";
				user = found;
				setLoggedIn(true);
			}
			else if (found instanceof Operateur) {
				setUserType("Operateur");
				navigateTo = "pages/operateur/home";
				user = found;
				setLoggedIn(true);
			}
			
		} else {
			FacesMessage message = new FacesMessage("Bad credentials!");
			FacesContext.getCurrentInstance().addMessage("login_form:login_submit", message);
			setLoggedIn(false);
			navigateTo = null;
		}
		return navigateTo;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
