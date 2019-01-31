package homePractice;

import java.io.*;
import java.util.*;

public class IndexOfMethode {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        
        int result = A.compareTo(B);
        
        if (result < 0) {
            System.out.println("No");
        }
        if (result == 0) {
            System.out.println("Equal");
        }
        if (result > 0) {
            System.out.println("Yes");
        }
        
        String A1 = A.substring(0, 1).toUpperCase();
        String B1 = B.substring(0, 1).toUpperCase();
        
        String A2 = A1 + A.substring (1);
        String B2 = B1 + B.substring (1);
        System.out.println(A2 + " " + B2);
    }
}



