public class Projector {
	String description;
	StreamingPlayer player;
	
	public Projector(String description, StreamingPlayer player) {
		this.description = description;
		this.player = player;
	}
	
	public void on() {
		System.out.println(description + "on");
	}
	
	public void off() {
		System.out.println(description + "off");
	}
	
	public String toString() {
		return description;
	}
}