import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
       double price = mealCost + ((double)tipPercent/100 * mealCost) + ((double)taxPercent/100 * mealCost);
        
        int total = (int) Math.round(price);
        
        System.out.println("The total meal cost is " + total + " dollars.");
    }
    
}
