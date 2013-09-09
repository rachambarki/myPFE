package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@ViewScoped
public class ChartBeanC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PieChartModel pieModel;

	public ChartBeanC() {
		createPieModel();
	}

	public PieChartModel getPieModel() {
		return pieModel;
	}

	private void createPieModel() {
		pieModel = new PieChartModel();

		pieModel.set("Effectuée", 540);
		pieModel.set("En cours", 325);
	
	}
}
