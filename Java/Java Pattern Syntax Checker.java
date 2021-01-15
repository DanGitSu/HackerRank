import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
            String pattern = in.nextLine();
            try{
                Pattern p = Paimport java.util.regex.Matcher;
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
                
                //Write your code herettern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}