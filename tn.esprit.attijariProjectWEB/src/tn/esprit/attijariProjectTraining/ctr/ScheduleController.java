package tn.esprit.attijariProjectTraining.ctr;

import java.io.Serializable;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

public class ScheduleController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6756827114838917384L;

	private ScheduleModel eventModel;

	private ScheduleModel lazyEventModel;

	private ScheduleEvent event = new DefaultScheduleEvent();

	private String theme;

	public ScheduleController() {
		eventModel = new DefaultScheduleModel();
		eventModel.addEvent(new DefaultScheduleEvent("Champions League Match",
				previousDay8Pm(), previousDay8Pm()));
	
		setLazyEventModel(new LazyScheduleModel() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void fetchEvents(final Date start, final Date end) {
				clear();

				Date random =getRandomDate(start);
				addEvent(new DefaultScheduleEvent("Lazy Event 1", random,
						random));

				random = getRandomDate(start);
				addEvent(new DefaultScheduleEvent("Lazy Event 2", random,
						random));
			}
		});
	}

	protected Date getRandomDate(Date start) {
		// TODO Auto-generated method stub
		return null;
	}

	private Date previousDay8Pm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addEvent(ActionEvent actionEvent) {
		if (event.getId() == null)
			eventModel.addEvent(event);
		else
			eventModel.updateEvent(event);

		event = new DefaultScheduleEvent();
	}

	public void onEventSelect(ScheduleEntryMoveEvent selectEvent) {
		event = selectEvent.getScheduleEvent();
	}

//	public void onDateSelect( selectEvent) {
//		event = new DefaultScheduleEvent(Math.random() + "",
//				selectEvent.getDate(), selectEvent.getDate());
//	}

	public void onEventMove(ScheduleEntryMoveEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Event moved", "Day delta:" + event.getDayDelta()
						+ ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	public void onEventResize(ScheduleEntryResizeEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Event resized", "Day delta:" + event.getDayDelta()
						+ ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	private void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public ScheduleModel getLazyEventModel() {
		return lazyEventModel;
	}

	public void setLazyEventModel(ScheduleModel lazyEventModel) {
		this.lazyEventModel = lazyEventModel;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	// Getters and Setters
}