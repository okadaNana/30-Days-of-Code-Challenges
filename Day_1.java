import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int intVar;
		double doubleVar;
		String strVar;
		intVar = scan.nextInt();
		doubleVar = scan.nextDouble();
		scan.nextLine();
		strVar = scan.nextLine();
		System.out.println(i + intVar);
		System.out.printf("%.1f\n", d + doubleVar);
		System.out.println(s + strVar);

		scan.close();
	}
}