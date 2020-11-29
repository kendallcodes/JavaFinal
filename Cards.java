package finalProject;

public class Cards {
	
	private int value; 
	private int name;
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	} 

	public void Card(int value, int name) {
		this.name = name; 
		this.value = value; 
	}
	
}
