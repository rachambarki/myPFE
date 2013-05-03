//package tn.esprit.attijariProjectTraining.ctr;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.ejb.EJB;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
//
//import tn.esprit.attijariProject.entities.Traitement;
//import tn.esprit.attijariProject.services.dao.interfaces.TraitementDaoLocal;
//
//@ManagedBean
//@SessionScoped
//public class TraitementCtr {
//
//	private Traitement traitement = new Traitement();
//
//	private List<Traitement> traitements = new ArrayList<Traitement>();
//
//	@EJB
//	TraitementDaoLocal traitementDaoLocal;
//
//	public Traitement getTraitement() {
//		return traitement;
//	}
//
//	public void setTraitement(Traitement traitement) {
//		this.traitement = traitement;
//	}
//
//	public List<Traitement> getTraitements() {
//		return traitements;
//	}
//
//	public void setTraitements(List<Traitement> traitements) {
//		this.traitements = traitements;
//	}
//
//	public String doAddTraitement() {
//		String retour = "";
//		try {
//			traitementDaoLocal.creer(traitement);
//		} catch (Exception e) {
//			retour = "ma zedech person";
//		}
//		return retour;
//
//	}
//
//}
