package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import tn.esprit.attijariProject.entities.Action;
import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.interfaces.ActionDaoLocal;
import tn.esprit.attijariProject.services.dao.interfaces.FicheDaoLocal;

@ManagedBean(name="ficheCtr")
@SessionScoped
public class FicheCtr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	public FicheDaoLocal ficheDaoLocal;
	public ActionDaoLocal actionDaoLocal;
	private String nameAction;
	private List<Action> listAAjouter =new ArrayList<Action>();
private List<Fiche> selectedFichesFromTable=new ArrayList<Fiche>();
	
	public String doSomthing(){
		Fiche ficheTMP=dataModelFichs.getRowData();
		selectedFichesFromTable.add(ficheTMP);
		
		System.out.println("ahla :"+selectedFichesFromTable.size());
		return "";
	}
	
	
	public String getNameAction() {
		return nameAction;
	}

	public void setNameAction(String nameAction) {
		this.nameAction = nameAction;
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

	public Date getHeuref() {
		return heuref;
	}

	public void setHeuref(Date heuref) {
		this.heuref = heuref;
	}

	public String getVerifi() {
		return verifi;
	}

	public void setVerifi(String verifi) {
		this.verifi = verifi;
	}

	private String modeOperatoire;
	private Date heureDebut;
	private Date heuref;
	private String verifi;
	private boolean actionIsVisible = true;
	private Fiche fiche = new Fiche();
	private List<Fiche> filtredFich;
	private List<Fiche> fiches = new ArrayList<Fiche>();
	
	private DataModel<Fiche> dataModelFichs=new ListDataModel<Fiche>();
	
	private Fiche fiche1 = new Fiche();

	private String ficheN;

	public String getFicheN() {
		return ficheN;
	}

	public void setFicheN(String ficheN) {
		this.ficheN = ficheN;
	}

	public Date getDateDeTrait() {
		return dateDeTrait;
	}

	public void setDateDeTrait(Date dateDeTrait) {
		this.dateDeTrait = dateDeTrait;
	}

	public String getFichePerio() {
		return fichePerio;
	}

	public void setFichePerio(String fichePerio) {
		this.fichePerio = fichePerio;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}

	public String getObserv() {
		return observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public String getOrdereDeL() {
		return ordereDeL;
	}

	public void setOrdereDeL(String ordereDeL) {
		this.ordereDeL = ordereDeL;
	}

	private Date dateDeTrait;
	private String fichePerio;
	private String descript;
	private Date dureeTrait;
	private Date jour;
	private String observ;
	private String ordereDeL;
	private Action action = new Action();
	

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

	public List<Fiche> getFiches() {
		fiches = ficheDaoLocal.findAllFiche();
		System.out.println(fiches.size());
		return fiches;
	}

	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}

	public String doVisibleAction() {

		actionIsVisible = true;
		System.out.println(actionIsVisible);
		return " ";
	}

	public String doAddFiche() {
		fiche.setDateDeTraitement(dateDeTrait);
		fiche.setDescriptionFiche(descript);
		fiche.setDureeTraitement(dureeTrait);
		fiche.setFicheName(ficheN);
		fiche.setFichePeriodicity(fichePerio);
		fiche.setJournee(jour);
//		List<Action> actions =new ArrayList<Action>();
//		actions.add(action);
		
		fiche.linkActionsToFiche(listAAjouter);
	
		System.out.println(listAAjouter.size());
		
		ficheDaoLocal.modifier(fiche);
		return "";

	}

	public String docreateAction() {
		action.setNameAction(nameAction);
		action.setHeureDebut(heureDebut);
		action.setModeOperatoire(modeOperatoire);
		action.setHeureFin(heuref);
		action.setVerification(verifi);
		System.out.println("action associé lel fiche");
		actionDaoLocal.creer(action);
		return "";
	}

	public String addActionToListActions(){
		action.setNameAction(nameAction);
		action.setHeureDebut(heureDebut);
		action.setModeOperatoire(modeOperatoire);
		action.setHeureFin(heuref);
		action.setVerification(verifi);
		
		listAAjouter.add(action);
		
		return"";
		
		
		
	}
	
	public Fiche getFiche1() {
		return fiche1;
	}

	public void setFiche1(Fiche fiche1) {
		this.fiche1 = fiche1;
	}

	public boolean isActionIsVisible() {
		return actionIsVisible;
	}

	public void setActionIsVisible(boolean actionIsVisible) {
		this.actionIsVisible = actionIsVisible;
	}

	public Date getDureeTrait() {
		return dureeTrait;
	}

	public void setDureeTrait(Date dureeTrait) {
		this.dureeTrait = dureeTrait;
	}

	public List<Fiche> getFiltredFich() {
		return filtredFich;
	}

	public void setFiltredFich(List<Fiche> filtredFich) {
		this.filtredFich = filtredFich;
	}

	public DataModel<Fiche> getDataModelFichs() {
	dataModelFichs.setWrappedData(ficheDaoLocal.findAllFiche());
		return dataModelFichs;
	}

	public void setDataModelFichs(DataModel<Fiche> dataModelFichs) {
		this.dataModelFichs = dataModelFichs;
	}


	public List<Fiche> getSelectedFichesFromTable() {
		return selectedFichesFromTable;
	}


	public void setSelectedFichesFromTable(List<Fiche> selectedFichesFromTable) {
		this.selectedFichesFromTable = selectedFichesFromTable;
	}

}
