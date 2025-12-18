import java.util.Scanner;

public class Concat {

    public static void displayString(String str){
        for(int i=0;i<str.length();i++)
        {
            System.out.println("Character at : " +(i+1)+ " is -> " +str.charAt(i));
        }
    }
    public static boolean checkPalindrome(String str)
    {
        int start = 0;
        int end = str.length() - 1 ;

        //str = madam
        while (start <= end) {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // String firstName = "Ashish";
        // String lastName = "Kumar";

        // System.out.println(firstName+ " " +lastName);
        // String name = firstName +" "+lastName;
        
        // displayString(name);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number or string");

        String str = (String)sc.nextLine();

        int x = 10;
        // String str1 = (String)x;
        String str1 = String.valueOf(x);

        System.out.println(str1);

        boolean flag = checkPalindrome(str);
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }   
}
