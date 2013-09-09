package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean
@ViewScoped
public class ChartBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CartesianChartModel categoryModel;

	public ChartBean() {
		createCategoryModel();
	}

	public CartesianChartModel getCategoryModel() {
		return categoryModel;
	}

	private void createCategoryModel() {
		categoryModel = new CartesianChartModel();

		ChartSeries effectue = new ChartSeries();
		effectue.setLabel("Effectué");

		effectue.set("2004", 120);
		

		ChartSeries en_cours = new ChartSeries();
		en_cours.setLabel("En cours");

		en_cours.set("2004", 52);
	
		categoryModel.addSeries(effectue);
		categoryModel.addSeries(en_cours);
	}
}
