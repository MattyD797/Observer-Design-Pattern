package observerdesignpattern;

import java.util.ArrayList;

/**
 * The competition to the Cook. They take notes of his actions and location.
 * @author Matt Duggan
 */
public class Cartel implements Observer{
	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	/**
	 * The cartel is registered as an observer of the cook and keeps an array list of notes. 
	 * @param cook The person cooking the meth. It is what the cartel is watching. 
	 */
	public Cartel(Subject cook) {
		this.cook = cook;
		cook.registerObserver(this);
		sightings = new ArrayList<>();
	}
	
	/**
	 * Adds a new note to the array list with the location and description.
	 * @param location The place where the cook does an action.
	 * @param description The action the cook is doing.
	 */
	public void update(String location, String description) {
		sightings.add(new Sighting(location,description));
	}

	/**
	 * Displays the notes that are in the sightings in <location> (<description>) format.
	 * @return A formated string of the array sightings.
	 */
	public String getLog() {
		String temp = "";
		for(Sighting values : sightings) {
			temp = temp + values.getLocation() + " (" + values.getDetails() + ")\n";
			
		}
		return temp;
	}
}