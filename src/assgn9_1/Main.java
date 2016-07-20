package assgn9_1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Rule: findbugs:REC_CATCH_EXCEPTION
 * @author maharshigor
 * This Class demonstrates a functionality of reading numbers from a file and find their arithmetic sum.
 * While reading a file it may catch FileNotFoundException and handle it by displaying "file not found" message on the screen,
 * but it also catches RuntimeException caused by the Integer.parseInt(...) call at line number 23.
 * 
 * It is a common bug pattern to say try { ... } catch (Exception e) { something } as a shorthand for catching 
 * a number of types of exception each of whose catch blocks is identical, but this construct also accidentally 
 * catches RuntimeException as well, masking potential bugs.
 */
public class Main {
	public static void main(String[] args) {
		BufferedReader br = null;
		Integer sum = 0;
		boolean success = true;
		try {
			br = new BufferedReader(new FileReader("numbers.txt"));
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
				Integer num = Integer.parseInt(str.trim());
				sum += num;
			}
		} catch (Exception e) {
			System.err.println("File not found!");
			success = false;
		} finally {
			System.out.println("Success: " + success);
			if(success) {
				System.out.println("Sum:"+ sum);
			}
		}
	}
}
