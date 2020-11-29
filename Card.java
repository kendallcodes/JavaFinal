package finalProject;

public class Card {

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

	public Card(int value, int name) {
		this.name = name; 
		this.value = value; 
	}
	
	
	public String toString() { 
	
	String[] values = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
	
	String[] names = {"Hearts", "Diamonds", "Spades", "Clubs"};
	
	String s = values[this.value] + " of " + names[this.name];
	
	return s;
	} 
	

	
	}


	



