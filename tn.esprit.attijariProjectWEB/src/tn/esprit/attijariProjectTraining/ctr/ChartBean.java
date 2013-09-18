package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoLocal;

@ManagedBean
@SessionScoped
public class ChartBean implements Serializable {

	@EJB
	private PlanningDaoLocal planningDaoLocal;
	private static final long serialVersionUID = 1L;
	private PieChartModel pieChartModel;
	private List<Planning> plannings = new ArrayList<Planning>();

 int a;

 int b;

	@PostConstruct
	public void initAandB() {
		a = 2;
		b = 56;
		System.out.println("statistique rasha inistialisation");

	}

//	public void construct() {
//		a = 2;
//		b = 56;
//		createPieModel();
//	}

//	public ChartBean() {
//		createPieModel();
//	}

	public PieChartModel getPieModel() {
		System.out.println(plannings.size());
		pieChartModel=new PieChartModel();
		for (Planning p : plannings) {
			if (p.isEtat()) {
				a += 1;
			} else {
				b += 1;
			}

		}
		pieChartModel.set("Effectuée", a);
		pieChartModel.set("En cours", b);
		System.out.println(a);

		return pieChartModel;
	}

//	private void createPieModel() {
//		System.out.println(plannings.size());
//
//	pieChartModel = new PieChartModel();
//
//		for (Planning p : plannings) {
//			if (p.isEtat()) {
//				a += 1;
//			} else {
//				b += 1;
//			}
//
//		}
//
//	pieChartModel.set("Effectuée", a);
//	pieChartModel.set("En cours", b);
//
//		System.out.println(a);
//
//	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public List<Planning> getPlannings() {
		plannings = planningDaoLocal.findAllPl();
		return plannings;

	}

	public void setPlannings(List<Planning> plannings) {
		this.plannings = plannings;
	}

	public PieChartModel getPieChartModel() {
		return pieChartModel;
	}

	public void setPieChartModel(PieChartModel pieChartModel) {
		this.pieChartModel = pieChartModel;
	}

	public void setPlanningDaoLocal(PlanningDaoLocal planningDaoLocal) {
		this.planningDaoLocal = planningDaoLocal;
	}

}
