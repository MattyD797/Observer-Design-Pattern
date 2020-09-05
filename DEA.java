package observerdesignpattern;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The "good" guys in breaking bad. They want to get information on the cook to gather intel.
 * @author Matt Duggan
 */
public class DEA implements Observer{
	private Subject cook;
	private ArrayList<String> locations;
	private String notes;
	
	/**
	 * The DEA is observing the cook and gathering the location in an array and the notes are one string. 
	 * @param cook The cooker of meth. 
	 */
	public DEA(Subject cook) {
		this.cook=cook;
		cook.registerObserver(this);
		locations = new ArrayList<>();
		notes = "";
	}
	
	/**
	 * Updates the DEA with a new sighting of the cook. 
	 * @param location The place the the cook is at. 
	 * @param description The thing the cook is doing. 
	 */
	public void update(String location, String description) {
		locations.add(location);
		notes = notes + description + "\n";
	}
	
	/**
	 * Displays the notes of the DEA in there preferred format. 
	 * @return A string with location and notes of the cook. 
	 */
	public String getLog() {
		String temp = "Locations:\n";
		for(String x : locations) {
			temp = temp + x + "\n";
		}
		temp = temp + "\nNotes:\n" + notes;
		return temp;
	}

}