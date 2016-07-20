package assgn9_4;

public class Main {
	public static void main(String[] args) {
		
	}
}

/**
 * Rectangle Class whose equality is defined as :
 * 		Two rectangles are equal if both their lengths and breadth are respectively equal.
 * @author maharshigor
 *
 */
class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public final boolean equals(Object obj) {
		if(!(obj instanceof Rectangle)) return false;
		Rectangle r = (Rectangle) obj;
		return length == r.length && breadth == r.breadth;
	}	
}

/**
 * MyRectangle is very similar to Rectangle with the only minor difference being,
 * for equality it only checks the shape and size and not the orientation
 * @author maharshigor
 *
 */
class Myrectangle extends Rectangle {

	public Myrectangle(int length, int breadth) {
		super(length, breadth);
	}
	
	/// final modifier in the equals method of the super class Rectangle doesnt allow to override equals method in MyRectangle
	
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Rectangle)) return false;
//		Rectangle r = (Rectangle) obj;
//		return (getLength() == r.getLength() && getBreadth() == r.getBreadth()) 
//				|| (getLength() == r.getBreadth() && getBreadth() == r.getLength());
//	}
	
}
