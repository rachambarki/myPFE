package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Remote
public interface FicheDaoRemote extends IDaoGenerique<Fiche> {
	Fiche findFiche(int idFiche);

	List<Fiche> findAllFiche();


}
