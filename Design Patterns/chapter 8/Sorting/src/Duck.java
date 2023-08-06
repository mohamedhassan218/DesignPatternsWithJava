public class Duck implements Comparable<Duck>{
	String name;
	int weigh;
	
	public Duck(String name, int weigh) {
		this.name = name;
		this.weigh = weigh;
	}
	
	@Override
	public String toString() {
		return name + " weights: " + weigh;
	}
	
	public int compareTo(Duck otherDuck) {
		if(this.weigh < otherDuck.weigh)
			return -1;
		else if(this.weigh == otherDuck.weigh)
			return 0;
		else
			return 1;
	}
}