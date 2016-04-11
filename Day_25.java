import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		for (int k = 0; k < N; k++) {
			int num = scan.nextInt();
			
			if (num == 1) {
				System.out.println("Not prime");
			} else if (num == 2) {
				System.out.println("Prime");
			} else {
				int m = (int) Math.sqrt(num + 1);
				boolean prime = true;
				for (int i = 2; i <= m; i++) {
					if (num % i == 0) {
						prime = false;
						break;
					}
				}
				System.out.println(prime ? "Prime" : "Not prime");
			}
		}
		
		scan.close();
	}

}
