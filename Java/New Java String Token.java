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
        String delim[] = {" ", "!", ",", "?", ".", "_", "'","@"};
        String ans[];
        for (String line : ans){
            System.out.printf("%s\n",line);
        }
        scan.close();
    }

    static String[] splitter(String s, String[] delim){
        // ArrayList<String> temp = new ArrayList<String>();
        for (String d : delim){
            s.split(d);
            // for (String t : s.split(d)){
            //     // if temp.add(t);

            // }
        }
        // // converts arraylist back to string[]
        // String ans[] = new String[temp.size()];
        // for (int j = 0; j < temp.size(); j++) { 
        //     ans[j] = temp.get(j); 
        // }

        return ans;
    }  
}
