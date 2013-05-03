package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.Traitement;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Local
public interface TraitementDaoLocal extends IDaoGenerique<Traitement> {
	Traitement findTraitement(int idTraitement);

	List<Traitement> findAllTraitement();

}
