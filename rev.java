import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int x = sc.nextInt();
        // x = 123
        int rev = x;
        int temp = 0;

        while(x>0)
        {
            int rem = x % 10;
            temp = temp*10 + rem;
            x/=10;
        }
        if(rev == temp)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
}
