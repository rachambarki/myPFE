package tn.esprit.attijariProject.services.dao.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.attijariProject.entities.Equipe;
import tn.esprit.attijariProject.services.dao.IDaoGenerique;

@Remote
public interface EquipeDaoRemote extends IDaoGenerique<Equipe> {



	List<Equipe> listAllEquipe();



	Equipe findEquipe(int idEquipe);


}
