package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.attijariProject.entities.Equipe;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Local
public interface EquipeDaoLocal extends IDaoGenerique<Equipe> {
	

	List<Equipe> listAllEquipe();

	

	Equipe findEquipe(int idEquipe);



}
