package observerdesignpattern;

/**
 * Contains the requirements to become an observer of the cook, such as a way to update their notes and display them. 
 * @author Matt Duggan
 */
public interface Observer {
	public void update(String location, String description);
	public String getLog();
}
