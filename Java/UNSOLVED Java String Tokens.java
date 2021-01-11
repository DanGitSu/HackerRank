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
        String delim[] = {"!", ",", "?", ".", "_", "'","@"};
        String[] d = splitter(s.split(" "),delim);
        for (String a : d){
            System.out.println(a);
        }

        scan.close();
    }

    // static String[] splitter(String[] subj, String[] delim){
    //     ArrayList<String> res = new ArrayList<String>();
    //     for (String d : delim){
    //         for (String i : subj){
    //             res.add(Arrays.asList(subj).indexOf(i),i.split(d));
    //         }
    //     }
    //     String str[] = new String[res.size()];
    //     for (int j = 0; j < res.size(); j++) { 
    //         str[j] = res.get(j); 
    //     }
    //     return str;
    // }
}
