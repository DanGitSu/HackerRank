import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); // queries q
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int c = a;
            for(int u=0;u<n;u++){
                c +=pow(2,u) * b;
                System.out.printf("%d ", c);
            }
            System.out.println();
        }
        in.close();
        
    }

    static int pow(int b, int e) { // not neccessary as Math.pow(); exists
        int r = 1;

        while (e != 0)
        {
            r *= b;
            --e;
        }

        return r;
    }
}