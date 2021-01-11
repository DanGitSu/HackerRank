// Daniel Su 2021 11 January
// https://github.com/DanGitSu
// sudaniel9@gmail.com

// Write Up for https://www.hackerrank.com/challenges/java-anagrams/problem
import java.util.Scanner; 

public class Solution {

    static boolean isAnagram(String a, String b) {
        // find the number of occurances for each letter in each string compare to other.

        //early error cases
        if (a == null || b == null || a == "" || b == "" || a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i =0; i<a.length(); i++){
            if (occurances(a.charAt(i), a)!=occurances(a.charAt(i), b)) return false;
        }
        return true;
    }

    static int occurances(char c, String s){
        int numOfTimes = 0;
        for (int i=0;i<s.length();i++){
            if(c == s.charAt(i)) numOfTimes++;
        }
        return numOfTimes;
    }

    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}