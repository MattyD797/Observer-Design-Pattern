package observerdesignpattern;

import java.util.ArrayList;

/**
 * Creates a meth cooker based on the movie breaking bad with different types of groups watching him
 * @author Matt Duggan
 */
public class Cook implements Subject{
	private ArrayList<Observer> observers;
	private String name;
	
	/**
	 * Identifies what groups are watching the cook and his name
	 * @param name The name of the cook
	 */
	public Cook(String name) {
		observers = new ArrayList<Observer>();
		this.name = name;
	}
	
	/**
	 * Adds a new group that is watching the cook
	 * @param observer The group taking notes on the cook
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * Removes a group that is watching the cook
	 * @param observer The group taking notes on the cook
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	
	/**
	 * Updates the groups that are watching the cook of his location and what he is doing
	 * @param location The place where the cook was spotted
	 * @param description A note of what the cook was doing
	 */
	public void notifyObservers(String location, String description) {
		for(Observer observer : observers) {
			observer.update(location, description);
		}
		
	}
	
	/**
	 * Passes the location and description to the observers when the cook is seen
	 * @param location The place where the cook was spotted
	 * @param description A note of what the cook was doing
	 */
	public void enterSighting(String location, String description) {
		notifyObservers(location, description);
	}
	
	/**
	 * Allows notes to use the name of the cook
	 * @return The name of the cook
	 */
	public String getName() {
		return name;
	}
}
