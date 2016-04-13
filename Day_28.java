import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String regexPattern = "@gmail.com$";
        Pattern p = Pattern.compile(regexPattern);
    
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> accounts = new ArrayList<>(N);
        for(int n = 0; n < N; n++){
            String firstName = in.next();
            String emailID = in.next();
                        
            if (p.matcher(emailID).find()) {
                accounts.add(firstName);
            }
        }
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
        in.close();
    }
}
