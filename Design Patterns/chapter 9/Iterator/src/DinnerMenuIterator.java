import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {
	// Array to hold the items.
	MenuItem[] list;
	int position = 0;
 
	public DinnerMenuIterator(MenuItem[] list) {
		this.list = list;
	}
 
	// Get the next element.
	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}

	// Check if the list has next element or not.
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	// Remove the current element from the array.
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}

}
