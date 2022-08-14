//any subject should implement the Subject interface.
public interface Subject 
{
	public void registerObserver(Observer O);
	public void removeObserver(Observer O);
	
	//this method notify the observers when the subject state has changed.
	public void notifyObservers();
}
