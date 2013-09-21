package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Local
public interface FicheDaoLocal extends IDaoGenerique<Fiche> {
	Fiche findFiche(int idFiche);

	List<Fiche> findAllFiche();
	
	Fiche updateFiche(Fiche fiche);

}
