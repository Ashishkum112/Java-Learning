
import java.util.Scanner;

public class PrintDecreasingOrder {

    public static void funcPrintDecreasingOrder(int n){
            if(n == 1)
            {
                System.out.println(n);
                return;
            }
            System.out.println(n);
            funcPrintDecreasingOrder(n-1);
    }
    public static void funcPrintIncreaseOrder(int n){
            if( n == 1){
                System.out.print(n + " ");
                return;
            }
            funcPrintIncreaseOrder(n-1);
            System.out.print(n + " ");
    }

    public static int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n * fact( n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        funcPrintDecreasingOrder(n);
        funcPrintIncreaseOrder(n);
        System.out.println("\n"+ "The factorial of a number is : " +fact(n));

        sc.close();
    }
}
