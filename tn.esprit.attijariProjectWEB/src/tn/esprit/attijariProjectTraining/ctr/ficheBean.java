package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.FilterEvent;

import tn.esprit.attijariProject.entities.Fiche;
import tn.esprit.attijariProject.services.dao.interfaces.FicheDaoLocal;

@ManagedBean
@ViewScoped
public class ficheBean implements Serializable {

	private static final long serialVersionUID = 435419092569364634L;
	@EJB
	FicheDaoLocal ficheDaoLocal;
	private Fiche fiche;
	private List<Fiche> fiches;
	private List<Fiche> filteredFiches;
	private boolean formDisplayed = false;
	public ficheBean(){}
	@PostConstruct
	public void init(){
		
		
		
		fiches=ficheDaoLocal.findAllFiche();
		
	}
	
	
	

	public void dosaveOrUpdate (){
		
		ficheDaoLocal.creer(fiche);
		fiches=ficheDaoLocal.findAllFiche();
		formDisplayed = false;
		
		
	}

	public void doNew(){
		
		fiche=new Fiche();
		formDisplayed = true;
	}
	
	
	
	
	
	
	
	public void doCancel(){
		fiche = new Fiche();
		fiches = ficheDaoLocal.findAllFiche();
		formDisplayed = false;
	}
	
	public void doDelete(){
		ficheDaoLocal.supprimer(fiche);
		fiches = ficheDaoLocal.findAllFiche();
		formDisplayed = false;
	}
	public void onRowSelect(SelectEvent event){
		formDisplayed = true;
	}
	
	public void onFilter(FilterEvent event){
		fiche = new Fiche();
		formDisplayed = false;
	}
	
	
	
	
	
	
	public Fiche getFiche() {
		return fiche;
	}
	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}
	public List<Fiche> getFiches() {
		return fiches;
	}
	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}
	public List<Fiche> getFilteredFiches() {
		return filteredFiches;
	}
	public void setFilteredFiches(List<Fiche> filteredFiches) {
		this.filteredFiches = filteredFiches;
	}
	public boolean isFormDisplayed() {
		return formDisplayed;
	}
	public void setFormDisplayed(boolean formDisplayed) {
		this.formDisplayed = formDisplayed;
	}

}
