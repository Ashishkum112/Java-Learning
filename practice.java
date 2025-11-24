import java.util.*;
public class practice{
    public static void main(String[] args)
    {  
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row of the array");
        int m = sc.nextInt();
        System.out.println("Enter the coloumn of the array");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {

                System.out.println("Enter the element");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {

                System.out.println("The element " + "at number " + "Row : " + i + " Coloumn " + j + " is : "+ arr[i][j]);
            }
        }
    }
}