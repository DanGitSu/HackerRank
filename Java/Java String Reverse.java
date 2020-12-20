import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (palindrome(A)) System.out.println("Yes");
        else System.out.println("No") ;
        
    }

    static Boolean palindrome(String A){
        for(int i=A.length(); i>0; i--){
            if (A.charAt(A.length()-i) == A.charAt(i-1));
            else return false;
        }
        return true;
    }
}



