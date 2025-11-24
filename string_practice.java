import java.util.Scanner;

public class string_practice {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        
        for(int i =0;i<sb.length()/2;i++)
        {
            int front = i;
            int back = sb.length()-1-i;

            char charFront = sb.charAt(front);
            char charBack = sb.charAt(back);

            sb.setCharAt(front, charBack);
            sb.setCharAt(back, charFront);
        }
        System.out.println(sb);
    }
}
