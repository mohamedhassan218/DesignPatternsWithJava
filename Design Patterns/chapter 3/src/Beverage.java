//The component class in the decorator pattern.
public abstract class Beverage 
{
	public enum Size{TALL, GRANDE, VENTI};
	
	/*To understand the enum:
	 * The code above is equal to this Class:
	 * class Size
	 * {	
	 * 		public static final Size TALL = new Size();
	 * 		public static final Size GRANDE = new Size();
	 * 		public static final Size VENTI = new Size();
	 * }
	 * */
	
	Size size = Size.TALL;
	
	String description = "Unknown Beverage";
	
	public String getDescription()
	{
		return description;
	}

	public void setSize(Size size)
	{
		this.size = size;
	}
	
	public Size getSize()
	{
		return this.size;
	}
	
	public abstract double cost();

}
