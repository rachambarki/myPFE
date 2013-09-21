package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;

import tn.esprit.attijariProject.entities.Planning;
import tn.esprit.attijariProject.services.dao.interfaces.PlanningDaoLocal;

@ManagedBean
@SessionScoped
public class ChartBeanC implements Serializable {

	@EJB
	private PlanningDaoLocal planningDaoLocal;
	private static final long serialVersionUID = 1L;
	private PieChartModel pieModel;

	// private List<Planning> plannings = new ArrayList<Planning>();

	private int a;

	private int b;

	// @PostConstruct
	// public void initAandB() {
	// a = 2;
	// b = 56;
	// System.out.println("statistique rasha");
	//
	// }
	public void construct() {

	}

	public ChartBeanC() {

	}

	public PieChartModel getPieModel() {
		createPieModel();

		return pieModel;
	}

	private void createPieModel() {
		List<Planning> plannings;
		plannings = planningDaoLocal.findAllPl();
		int x = 0;
		int y = 0;

		for (Planning p : plannings) {
			if (p.isEtat()) {
				x += 1;
			} else {
				y += 1;
			}

		}
		pieModel = new PieChartModel();

		pieModel.set("Effectuée", x);
		pieModel.set("En cours", y);

		System.out.println(x);
		System.out.println(y);

	}

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

	// public List<Planning> getPlannings() {
	// plannings = planningDaoLocal.findAllPl();
	// System.out.println("cc");
	// return plannings;
	//
	// }
	//
	// public void setPlannings(List<Planning> plannings) {
	// this.plannings = plannings;
	// }
	public PlanningDaoLocal getPlanningDaoLocal() {
		return planningDaoLocal;
	}

	public void setPlanningDaoLocal(PlanningDaoLocal planningDaoLocal) {
		this.planningDaoLocal = planningDaoLocal;
	}

	public void setPieModel(PieChartModel pieModel) {
		this.pieModel = pieModel;
	}

}
