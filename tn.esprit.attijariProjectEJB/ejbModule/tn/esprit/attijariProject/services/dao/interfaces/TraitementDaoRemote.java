package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.Traitement;
import tn.esprit.attijariProject.entities.User;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Remote
public interface TraitementDaoRemote extends IDaoGenerique<Traitement> {
	Traitement findTraitement(int idTraitement);

	List<Traitement> findAllTraitement();
	//User finfUserByMatricule(Integer matricule);


}
