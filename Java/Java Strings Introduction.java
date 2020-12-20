import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        String lexo;
        if(A.compareTo(B) > 0 ){
            lexo = "Yes";
        }else{
            lexo = "No";
        }s
        
        

        System.out.println(length);
        System.out.println(lexo);
        System.out.printf("%s %s",capitalize(A),capitalize(B));
        
    }

    private static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
    
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}



