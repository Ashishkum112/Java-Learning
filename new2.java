import java.util.Scanner;

public class new2 {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:System.out.println("Sunday");
            break;
            case 2:System.out.println("Monday");
            break;
            case 3:System.out.println("Tuesday");
            break;
            case 4:System.out.println("We");
            break;
            case 5:System.out.println("thur");
            break;
            case 6:System.out.println("Satu");
            break;
            default:
            System.out.println("Wrong Input");
        }
    }
}
