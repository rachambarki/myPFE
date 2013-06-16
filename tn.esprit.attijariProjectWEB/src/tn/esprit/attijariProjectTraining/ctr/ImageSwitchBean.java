package tn.esprit.attijariProjectTraining.ctr;

import java.util.ArrayList;
import java.util.List;

public class ImageSwitchBean {

	private List<String> images;

	public ImageSwitchBean() {
		images = new ArrayList<String>();
		images.add("fiche.png");
		images.add("csv.png");
		
	}

	public List<String> getImages() {
		return images;
	}
}