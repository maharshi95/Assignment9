package assgn9_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class provides a functionality of finding out unique set of 2-D co-ordinates from a given input of (x,y) co-ordinates
 * @author maharshigor
 * squid: S1221
 * Naming a method hashcode() or equal() can be either
 *	- a bug in form of a typo. Application using equals() or hashCode() might not behave as expected
 *	- done on purpose, which in case will confuse a programmer making him think it's a bug 
 */
public class Main {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(new Point(2, 3).equals(new Point(2, 3)));
		System.out.println("Number of points: ");
		Set<Point> set = new HashSet<Point>();
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			Point p = new Point(x, y);
			set.add(p);
		}
		for(Point p : set) {
			System.out.println(p);
		}
	}
}


/**
 * Point class represents a 2-Dimensional point in a Cartesian plane with values x and y
 * @author maharshigor
 *
 */
class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Explicitly defining equal() function to check if two points are same
	 * @param Point p 
	 * @return true if both x and y co-ordinates of given Point p are same as that of 'this' Point
	 */
	public boolean equal(Object o) {
		Point p = (Point)o;
		return x==p.x && y == p.y;
	}
	
	public int hashcode() {
		return ("" + (""+x).hashCode() + (""+x).hashCode()).hashCode(); 
	}
	
	/**
	 * Below code can be uncommented to see the correct and successful execution of an application using HashMap<Point>
	 */
//	@Override
//	public boolean equals(Object o) {
//		Point p = (Point)o;
//		return x==p.x && y == p.y;
//	}
//	
//	@Override
//	public int hashCode() {
//		return ("" + (""+x).hashCode() + (""+x).hashCode()).hashCode(); 
//	}
	
	
	@Override
	public String toString() {
		return "(" + x + ", " + y +  ")";
	}
	
}
