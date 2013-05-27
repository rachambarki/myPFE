package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class formBean implements Serializable {


	private List<String> selectedMovies;

	private Map<String, String> movies;

	public formBean() {
		movies = new HashMap<String, String>();
		movies.put("Scarface", "Scarface");
		movies.put("Goodfellas", "Goodfellas");
		movies.put("Godfather", "Godfather");
		movies.put("Carlito's Way", "Carlito's Way");
	}

	public List<String> getSelectedMovies() {
		return selectedMovies;
	}

	public void setSelectedMovies(List<String> selectedMovies) {
		this.selectedMovies = selectedMovies;
	}

	public Map<String, String> getMovies() {
		return movies;
	}
}
