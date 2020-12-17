import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        StringBuilder o = new StringBuilder("1 "+sc.nextLine()+"\n");
        int n = 2;
        while(sc.hasNext()){
            o.append(n+ " " +sc.nextLine()+"\n");
            n++;
        }
        System.out.println(o);

    }
}