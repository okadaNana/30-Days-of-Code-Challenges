import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n-1; k++) {
                if (arr[k] > arr[k+1]) {
                    arr[k] = arr[k] ^ arr[k+1];
                    arr[k+1] = arr[k] ^ arr[k+1];
                    arr[k] = arr[k] ^ arr[k+1];
                    
                    numberOfSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[n - 1]);
    }
}
