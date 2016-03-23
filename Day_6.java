package com.owen.javapro;

import java.util.Scanner;

public class Solution {

	private static String isFunny(char[] charArray) {
		boolean flag = true;
		for (int i = 1, j = charArray.length - 1; i < charArray.length; i++, j--) {
			if (Math.abs(charArray[i] - charArray[i - 1]) != Math.abs(charArray[j] - charArray[j - 1])) {
				flag = false;
				break;
			}
		}
		return flag ? "Funny" : "Not Funny";
	}
	
	public static void main(String[] args) {		
		/*
        Solution 1:
        
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();
		String result = "";
		for (int c = 0; c < count; c++) {
			String S = scan.nextLine();

			String R = "";
			for (int i = S.length() - 1; i >= 0; i--) {
				R += S.charAt(i);
			}

			String flag = null;
			for (int i = 1; i < S.length(); i++) {
				int asciiS = S.charAt(i) - S.charAt(i - 1);
				int asciiR = R.charAt(i) - R.charAt(i - 1);

				if (Math.abs(asciiS) == Math.abs(asciiR)) {
					flag = "Funny";
				} else {
					flag = "Not Funny";
					break;
				}
			}
			result += flag + "\n";
		}
		scan.close();
		System.out.println(result);
		*/
        
        // Solution 2:
        Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println(isFunny(scan.next().toCharArray()));
		}
		
		scan.close();
	}

}
