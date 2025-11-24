import java.util.*;

public class Fact {

    public static int fact_Check(int a){
        if(a <= 1)
        {
            return 1;
        }
        return a*fact_Check(a-1);
    }
    public static void main(String args[]){
        System.out.println("Enter the number for finding Factorial");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int fact = fact_Check(n);
        System.out.println("The Factorial is " + fact);
    }
}
