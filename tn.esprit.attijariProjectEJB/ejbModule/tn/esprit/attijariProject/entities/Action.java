package tn.esprit.attijariProject.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_ACTION")
public class Action implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idAction;
	private String idNameAction;
	private String modeOperatoire;
	private Date heureDebut;
	private Date heureFin;
	private String verification;
	private Fiche fiche;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIdAction() {
		return idAction;
	}

	public void setIdAction(int idAction) {
		this.idAction = idAction;
	}

	public String getIdNameAction() {
		return idNameAction;
	}

	public void setIdNameAction(String idNameAction) {
		this.idNameAction = idNameAction;
	}

	public String getModeOperatoire() {
		return modeOperatoire;
	}

	public void setModeOperatoire(String modeOperatoire) {
		this.modeOperatoire = modeOperatoire;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public String getVerification() {
		return verification;
	}

	public void setVerification(String verification) {
		this.verification = verification;
	}

	@ManyToOne
	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

}
