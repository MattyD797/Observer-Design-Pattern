package observerdesignpattern;

/**
 * This organizes the sightings of the cook into location and description. Currently, only utilized by cartel. 
 * @author Matt Duggan
 */
public class Sighting {
	private String location;
	private String details;
	
	/**
	 * What is needed for each sighting of the meth cooker. 
	 * @param location The place the cook is at. 
	 * @param details The thing the cook is doing. 
	 */
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
	}
	
	/**
	 * Grabs the location of the cook from a sighting event. 
	 * @return A string with the place the cook is at. 
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * Grabs the details of the cook during a sighting event. 
	 * @return A string of the actions of the cook. 
	 */
	public String getDetails() {
		return details;
	}

}
