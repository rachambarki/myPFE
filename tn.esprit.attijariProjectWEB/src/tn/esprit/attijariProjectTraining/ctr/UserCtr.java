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
	private String password;
	private Integer matricule;
	public Integer getMatricule() {
		return matricule;
	}

	public void setMatricule(Integer matricule) {
		this.matricule = matricule;
	}

	private String firstName;
	private String lastName;
	private String mailAdress;

	@EJB
	private UserDaoLocal userDaoLocal;

	public UserCtr() {
	}

	private User user = new User();

	private List<User> users = new ArrayList<User>();
	private boolean displayForm;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public UserDaoLocal getUserDaoLocal() {
		return userDaoLocal;
	}

	public void setUserDaoLocal(UserDaoLocal userDaoLocal) {
		this.userDaoLocal = userDaoLocal;
	}

	public List<User> getUsers() {
		users = userDaoLocal.findAllUsers();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String doAddUser() {
		String retour = "";
		try {
			userDaoLocal.creer(user);

		} catch (Exception e) {
			retour = "ma zedech person";
		}
		return retour;

	}

	public String doRemoveUser(User user) {
		String msg1 = "";
		try {
			userDaoLocal.supprimer(user);
			msg1 = "user_removed_Ok";
		} catch (Exception e) {
			msg1 = "user_removed_Ko";
		}
		return msg1;
	}

	public String findByMatricule(Integer matricule) {
		String msg2 = "";
		users = userDaoLocal.findAllUsers();
		try {
			for (User m : users) {
				if ((m.getMatricule()== matricule )&&( m.getPassword().equals(password))) {
					user = m;
					msg2 = "user_getted_Ok";
				}
			}
		} catch (Exception e) {
			msg2 = "user_getted_Ko";
		}
		return msg2;
	}

	public String CtrlUsers() {

		String msg3 = "";
		msg3 = "LOGIN_OK1";
		;

		users = userDaoLocal.findAllUsers();
		for (User m : users) {

//			if (m.getMatricule().equals(matricule)
//					&& m.getPassword().equals(password)) {
//				user = m;
//				return msg3;
//			} else
//
//			if (m.getMatricule().equals(matricule)) {
//				user = m;
			if (m.getMatricule()==(matricule) && (m.getPassword()==(password))) {
				user = m;
				return msg3;
			} else

			if (m.getMatricule()==(matricule)) {
				user = m;

				return msg3;
			}

		}
		return msg3;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String doUpdate() {
		setDisplayForm(true);

		return "";
	}

	public boolean isDisplayForm() {
		return displayForm;
	}

	public void setDisplayForm(boolean displayForm) {
		this.displayForm = displayForm;
	}

}
