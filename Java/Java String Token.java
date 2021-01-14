// Daniel Su 2021 11 January
// https://github.com/DanGitSu
// sudaniel9@gmail.com

// Write Up for https://www.hackerrank.com/challenges/java-string-tokens/problem?h_r=next-challenge&h_v=zen
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.length() > 0 ){
            String delim = "[ !,?._'@\\s]+";
            String[] ans = s.split(delim);
            System.out.println(ans.length);
            for (String line : ans){
                System.out.println(line);
            }
        }else{
            System.out.println(0);
        }
        scan.close();
    }

}
