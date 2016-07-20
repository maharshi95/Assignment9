package assgn9_3;

/**
 * squid S1244 Do not have '==' equality checks on floats or double variables as the check may behave quite differently.
 * @author maharshigor
 *
 */
public class Main {
	public static void main(String[] args) {
		double f1 = 2.45;
		double factor = 12342432;
		double f2 = (f1/factor)*f1;
		if(f1 == f2) {
			System.out.println("Do Some action here");
		} else {
			System.out.println("False Condition");
		}
	}
}
