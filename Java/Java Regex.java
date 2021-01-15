import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here

class MyRegex{
    private String zeroto255 = "([0-9]|[0-9][0-9]|[0-2][0-5][0-5]|2[0-4][0-9])";
    public String pattern = zeroto255 + "." + zeroto255 + "." + zeroto255 + "."+ zeroto255;
}