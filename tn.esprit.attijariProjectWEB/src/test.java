//package managedBean;
//import java.util.ArrayList;
//import java.util.List;
//import javax.ejb.EJB;
//import outils.OutComes;
//import services.UserServicesLocal;
//import entities.User;
//public class UserBean {
//private User user = new User();
//private String matricule_user;
//private String mdp;
//private String nom;
//private String prenom;
////	org.jboss.logging.Logger logger = org.jboss.logging.Logger.getLogger(this
////	 .getClass());
//private List<User> users = new ArrayList<User>();
//@EJB
//private UserServicesLocal userServicesLocal;
//public User getUser() {
//return user;
//}
//public void setUser(User user) {
//this.user = user;
//}
//public String getMatricule_user() {
//return matricule_user;
//}
//public void setMatricule_user(String matricule_user) {
//this.matricule_user = matricule_user;
//}
//public String getMdp() {
//return mdp;
//}
//public void setMdp(String mdp) {
//this.mdp = mdp;
//}
//public List<User> getUsers() {
//return users;
//}
//public void setUsers(List<User> users) {
//this.users = users;
//}
//public UserServicesLocal getUserServicesLocal() {
//return userServicesLocal;
//}
//public void setUserServicesLocal(UserServicesLocal userServicesLocal) {
//this.userServicesLocal = userServicesLocal;
//}
//public String doAddUser(User user) {
//
//try {
//userServicesLocal.add(user);
//} catch (Exception e) {
//return null;
//}
//return null;
//}
//public String doRemoveUser(User user) {
//String msg1 = "";
//try {
//userServicesLocal.remove(user);
//msg1 = "user_removed_Ok";
//} catch (Exception e) {
//msg1 = "user_removed_Ko";
//}
//return msg1;
//}
//public String getByMatricule(String matricule_user) {
//String msg2 = "";
//users = userServicesLocal.getAll();
//try {
//for (User m : users) {
//if (m.getMatricule_user().equals(matricule_user)
//&& m.getMdp().equals(mdp)) {
//user = m;
//msg2 = "user_getted_Ok";
//}
//}
//} catch (Exception e) {
//msg2 = "user_getted_Ko";
//}
//return msg2;
//}
//public String CtrlUsers() {
//users = userServicesLocal.getAll();
//for (User m : users) {
//if (m.getMatricule_user().equals(matricule_user)
//&& m.getMdp().equals(mdp) && m.getType_user().equals("1")) {
//user = m;
//return OutComes.LOGIN_OK;
//} else {
//if (m.getMatricule_user().equals(matricule_user)
//&& m.getMdp().equals(mdp)
//&& m.getType_user().equals("0")) {
//user = m;
//return OutComes.LOGIN_OK1;
//}
//
//}
//}
//return null;
//}
//public String getNom() {
//return nom;
//}
//public void setNom(String nom) {
//this.nom = nom;
//}
//public String getPrenom() {
//return prenom;
//}
//public void setPrenom(String prenom) {
//this.prenom = prenom;
//}
//}