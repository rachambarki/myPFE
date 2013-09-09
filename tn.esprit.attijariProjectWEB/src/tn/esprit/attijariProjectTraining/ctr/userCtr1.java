package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import tn.esprit.attijariProject.entities.Administrateur;
import tn.esprit.attijariProject.entities.Operateur;
import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.interfaces.UserDaoLocal;

@ManagedBean
@SessionScoped
// @RequestScoped
public class userCtr1 {

	private static final String Prenom = null;
	private String fName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Integer getMatr() {
		return matr;
	}

	public void setMatr(Integer matr) {
		this.matr = matr;
	}

	public UserDaoLocal getUserDaoLocal() {
		return userDaoLocal;
	}

	public void setUserDaoLocal(UserDaoLocal userDaoLocal) {
		this.userDaoLocal = userDaoLocal;
	}

	public static String getPrenom() {
		return Prenom;
	}

	private String lName;
	private String pass;
	private String mail;
	private String rol;
	private Integer matr;

	@EJB
	UserDaoLocal userDaoLocal;

	private User user1 = new User();
	private Operateur operateur1 = new Operateur();
	private Administrateur administrateur1 = new Administrateur();
	private User user2 = new User();
	private List<User> users = new ArrayList<User>();
	private List<Operateur> operateurs = new ArrayList<Operateur>();
	private List<Administrateur> administrateurs = new ArrayList<Administrateur>();

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public String docreateUser() {
		user1.setFirstName(fName);
		user1.setLastName(lName);
		user1.setMailAdress(mail);
		user1.setMatricule(matr);
		user1.setPassword(pass);
		user1.setRole(rol);
		userDaoLocal.modifier(user1);
		return "";
	}

	public String docreateOp() {

		userDaoLocal.creer(operateur1);
		return "";
	}

	public String docreateAdmin() {

		userDaoLocal.creer(administrateur1);
		return "";
	}

	public userCtr1() {
	}

	public void savePerson(ActionEvent actionEvent) {
		String firstname = null;
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Welcome " + firstname + " " + Prenom + "!"));
	}

	public void selectionner(ActionEvent actionEvent) {
		int id = (Integer) FacesContext.getCurrentInstance()
				.getExternalContext().getInitParameterMap().get("id");

		user2 = userDaoLocal.finfUserById(id);
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public void doUpdateUser(ActionEvent actionEvent) {

		userDaoLocal.modifier(user2);

	}

	public void doUpdateOp(ActionEvent actionEvent) {

		userDaoLocal.modifier(operateur1);

	}

	public void doUpdateAdmin(ActionEvent actionEvent) {

		userDaoLocal.modifier(administrateur1);

	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Operateur getOperateur1() {
		return operateur1;
	}

	public void setOperateur1(Operateur operateur1) {
		this.operateur1 = operateur1;
	}

	public Administrateur getAdministrateur1() {
		return administrateur1;
	}

	public void setAdministrateur1(Administrateur administrateur1) {
		this.administrateur1 = administrateur1;
	}

	public List<Operateur> getOperateurs() {
		return operateurs;
	}

	public void setOperateurs(List<Operateur> operateurs) {
		this.operateurs = operateurs;
	}

	public List<Administrateur> getAdministrateurs() {
		return administrateurs;
	}

	public void setAdministrateurs(List<Administrateur> administrateurs) {
		this.administrateurs = administrateurs;
	}

}
