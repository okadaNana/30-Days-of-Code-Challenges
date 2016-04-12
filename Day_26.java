import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayReturn = scan.nextInt();
        int monthReturn = scan.nextInt();
        int yearReturn = scan.nextInt();
        
        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();
        
        int hackos = 0;
        if (yearReturn != yearExpected) {
            hackos = 10000;
        } else {
            if (monthReturn > monthExpected) {
                hackos = 500 * (monthReturn - monthExpected);
            } else {
                if (dayReturn > dayExpected) {
                    hackos = 15 * (dayReturn - dayExpected);
                } else {
                    hackos = 0;
                }
            }
        }
        
        System.out.println(hackos);
    }
}
