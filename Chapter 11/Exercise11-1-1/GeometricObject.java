package exercise11_1;


public class GeometricObject {
	private String color = "blue";
	private String filled = "true"; 
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	
	}

	public GeometricObject ( String color, String filled) {
		dateCreated = new java.util.Date();
		this.color = color; 
		this.filled = filled; 
		
	}
	
	public String getColor() {
		return this.color; 
		
	}
	
	public void setColor(String color) {
		this.color = color; 
		
	}

	public String isFilled() {
		return this.filled; 
		
	}
	
	public void setFilled(String filled) {
		this.filled = filled;
		
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
		
	}
	
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

	}
}

