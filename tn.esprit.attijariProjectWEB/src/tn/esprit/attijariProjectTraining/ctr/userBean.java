//package tn.esprit.attijariProjectTraining.ctr;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//import javax.ejb.EJB;
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//import javax.faces.component.html.HtmlDataTable;
//import javax.faces.context.FacesContext;
//import javax.faces.event.ActionEvent;
//import javax.faces.model.SelectItem;
//
//import org.primefaces.component.datatable.DataTable;
//import org.primefaces.event.RowEditEvent;
//
//import tn.esprit.attijariProject.entities.User;
//import tn.esprit.attijariProject.services.dao.interfaces.UserDaoLocal;
//
//@ManagedBean
//@SessionScoped
//public class userBean {
//
//	private String matricule;
//	private String motDePasse;
//	private String nom;
//	private String prenom;
//	private String adresseMail;
//	private User user;
//	private User userSelected;
//	private String type_user;
//	private List<SelectItem> roles;
//	private List<User> allUser;
//	private HtmlDataTable users;
//
//	@EJB
//	UserDaoLocal mplementUserServices;
//	
//
//	@PostConstruct
//	public void init() {
//
//		setUser(new User());
//
//		// allUser = new ArrayList<User>();
//		// User user = new User();
//		// user.setMatricule_user("11");
//		// user.setNom("chouk");
//		// user.setPrenom("ibti");
//		// user.setAdresseMail("ch.in@gmai.com");
//		// user.setRole(Role.ADMIN);
//		// User user1 = new User();
//		// user1.setMatricule_user("1122");
//		// user1.setNom("chouk11");
//		// user1.setPrenom("ibti11");
//		// user1.setAdresseMail("ch11.in@gmai.com");
//		// user1.setRole(Role.SIMPLE_USER);
//		//
//		// allUser.add(user);
//		// allUser.add(user1);
//
//		userSelected = new User();
//
//	}
//
//	public String goToList() {
//
//		return "GererUtilisateurs.xhtml?faces-redirect=true";
//	}
//
//	public String goToAdd() {
//
//		return "AjoutUtilisateur.xhtml?faces-redirect=true";
//	}
//
//	public String goToGerer() {
//
//		return "GererUtilisateur.xhtml?faces-redirect=true";
//	}
//
//	public User getUser() {
//
//		user = (User) FacesContext.getCurrentInstance().getExternalContext()
//				.getSessionMap().get("user");
//
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	// public List<SelectItem> getRoles() {
//	//
//	// roles = new ArrayList<SelectItem>();
//	// for (Role r : Role.values())
//	// roles.add(new SelectItem(r, r.toString()));
//	//
//	// return roles;
//	// }
//
//	public void setRoles(List<SelectItem> roless) {
//		roless = roles;
//	}
//
//	static int x = 0;
//
//	public List<User> getAllUser() {
//
//		allUser = mplementUserServices.findAllUsers();
//
//		return allUser;
//	}
//
//	public void setAllUser(List<User> allUser) {
//		this.allUser = allUser;
//	}
//
////	public void supprimer()
////
////	{
////	String matricule = FacesContext.getCurrentInstance()
////				.getExternalContext().getRequestParameterMap().get("matricule");
////		for (User u : new ArrayList<User>(allUser)) {
////			if (u.getMatricule() == matricule) {
////				mplementUserServices.supprimer(u);
////			}
////		}
////
////	}
//
//	// public String ValiderUser() {
//	// String msg = "";
//	// if ((user.getMatricule_user().equals(matricule_user))
//	// && (user.getMdp().equals(mdp))
//	// ) {
//	//
//	// return "InterfaceAdmin.xhtml";
//	// } else {
//	// return "InterfaceSimpleUser.xhtml";
//	// }
//	//
//	// }
//
////	public String delete() {
////
////		User u = (User) users.getRowData();
////		implementUserServices.remove(u);
////
////		return "GererUtilisateurs.xhtml?faces-redirect=true";
////	}
//
////	public String add() {
////		User user = new User();
////		user.setNom(nom);
////		user.setPrenom(prenom);
////		user.setMatricule_user(matricule);
////		user.setE_mail(adresseMail);
////		System.out.println(adresseMail);
////		user.setMdp(motDePasse);
////		user.setType_user("0");
////		implementUserServices.add(user);
////		user.setE_mail(adresseMail);
////		// implementUserServices.update(user);
////		System.out.println("oki");
////		return "GererUtilisateurs.xhtml?faces-redirect=true";
////	}
//
//	public void onEdit(RowEditEvent event) {
//
//		System.out
//				.println(((User) ((DataTable) event.getSource()).getRowData())
//						.getMailAdress());
//		User user = (User) event.getObject();
//
//		FacesMessage msg = new FacesMessage("Utilisateur modifié ",
//				user.getMatricule() + "");
//
//		FacesContext.getCurrentInstance().addMessage(null, msg);
//		System.out.println(user.getMailAdress());
//		mplementUserServices.modifier((User) event.getObject());
//
//	}
//
//	public String getType_user() {
//		return type_user;
//	}
//
//	public void setType_user(String type_user) {
//		this.type_user = type_user;
//	}
//
//	public String getMatricule() {
//		return matricule;
//	}
//
//	public void setMatricule(String matricule_user) {
//		this.matricule = matricule_user;
//	}
//
//	@javax.validation.constraints.Size(min = 3, max = 7, message = "mot de passe incorrecte")
//	public String getMotDePasse() {
//		return motDePasse;
//	}
//
//	public void setMotDePasse(String MotDePasse) {
//		this.motDePasse = MotDePasse;
//	}
//
////	public String ValiderUser() {
////		List<User> us = mplementUserServices.findAllUsers();
////		System.out.println(matricule);
////		System.out.println(motDePasse);
////		User user = new User();
////
////		for (User m : us) {
////			if (m.getMatricule_user().equals(matricule)
////					&& m.getMdp().equals(motDePasse)
////					&& m.getType_user().equals("1")) {
////				msg = "/Admin/InterfaceAdmin.xhtml?faces-redirect=true";
////
////				user = m;
////			}
////			if (m.getMatricule_user().equals(matricule)
////					&& m.getMdp().equals(motDePasse)
////					&& m.getType_user().equals("0")) {
////				msg = "InterfaceSimpleUser.xhtml?faces-redirect=true";
////				user = m;
////			}
////
////		}
////		FacesContext context = FacesContext.getCurrentInstance();
////		context.addMessage(null, new FacesMessage("Vérifiez vos parametres",
////				"d'authetification svp... "));
////
////		FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
////				.put("user", user);
////		System.out.println("Bienvenue++++++++" + user.getNom()
////				+ user.getPrenom());
////
////		return msg;
////	}
////
////	public String getNom() {
////		return nom;
////	}
////
////	public void setNom(String nom) {
////		this.nom = nom;
////	}
////
////	public String getPrenom() {
////		return prenom;
////	}
////
////	public void setPrenom(String prenom) {
////		this.prenom = prenom;
////	}
////
////	public String getAdresseMail() {
////		return adresseMail;
////	}
////
////	public void setAdresseMail(String adressemail) {
////		adressemail = adresseMail;
////	}
//
//	public void update(ActionEvent event) {
//
//		mplementUserServices.modifier(userSelected);
//
//	}
//
//	public void selectionner(ActionEvent event) {
//
//	String matricule = FacesContext.getCurrentInstance()
//				.getExternalContext().getRequestParameterMap().get("matricule");
//		System.out.println("---" + matricule);
//		userSelected = mplementUserServices.finfUserByMatricule(matricule);
//
//		// userSelected=(User) tableUser.getRowData();
//
//		// return null;
//	}
//
////	public void supprimer(ActionEvent event) {
////
////		String matricule = FacesContext.getCurrentInstance()
////				.getExternalContext().getRequestParameterMap().get("matricule");
////		System.out.println("---" + matricule);
////		userSelected = mplementUserServices.finfUserByMatricule(matricule);
////
////		mplementUserServices.supprimer(userSelected);
////	}
//
//	public User getUserSelected() {
//		return userSelected;
//	}
//
//	public void setUserSelected(User userSelected) {
//		this.userSelected = userSelected;
//	}
//
//}
