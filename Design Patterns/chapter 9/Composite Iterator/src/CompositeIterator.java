import java.util.*;

// Implements the java.util.Iterator interface.
public class CompositeIterator implements Iterator<MenuComponent> {
	
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
   
	/*
	 * The Iterator of the top-level composite we're going to iterate over is
	 * passed in. We through that in a stack data structure.
	 **/
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
   
	public MenuComponent next() {
		/*
		 * When client want to get the next element, we first
		 * make sure that there's one.
		 * **/
		if (hasNext()) {
			/*
			 * If there's a next element, we get the current 
			 * iterator off the stack and get its next element.
			 * **/
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			
			/*
			 * When throw that component's iterator on the stack, if the 
			 * component is a menu, it'll iterate over all its items. If 
			 * the component is MenuItem, we get the NullIterator and no 
			 * iteration happens. Then we return the component.
			 * **/
			stack.push(component.createIterator());
			return component;
		} else {
			return null;
		}
	}
  
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
}