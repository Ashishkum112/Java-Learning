import java.util.Scanner;

public class CountBits {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result[] = new int[n+1];
        for(int i=0;i<=n;i++)
            {
            int count = 0;
            int pos = i;
            int current_element = i;
            while (current_element > 0) {
                if( (current_element & 1) != 0 )
                {
                    count++;
                }
                current_element = current_element >> 1;
            }
            result[pos] = count;
        }
        for(int i =0;i<result.length;i++)
        {
            System.out.print(result[i] +",");
        }
    }
}
