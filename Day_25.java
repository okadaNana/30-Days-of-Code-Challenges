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
            
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            System.out.println(count == 2 ? "Prime" : "Not prime");
        }
        
        scan.close();
    }
}
