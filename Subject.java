package observerdesignpattern;

/**
 * This is the requirements necessary to be what is observed by the observers. You need a way to add, remove and notify observers. 
 * @author Matt Duggan
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String location, String description);
}
