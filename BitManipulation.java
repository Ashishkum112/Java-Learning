import java.util.Scanner;

public class BitManipulation {

    public static int clearIthBit(int num , int bitMask)
    {
        return num & ~(bitMask);
    }

    public static void main(String[] args) {
        
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(~0);
        // System.out.println("Left Shift -> " +(5<<2)); // 5 * 2^2 = 20 ;
        // System.out.println("Left Shift -> " +(5>>2)); // 5 / 2^2 = 1;

        //check even or odd
        // int bitMask = 1;
        // if((20 & n) == 0)
        // {
        //     System.out.println("Even");
        // }
        // else
        // {
        //     System.out.println("Odd");
        // }

        //Get ith Postition of the number

        //Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking the input
        int x  = sc.nextInt();

        //Taking the bitmask 
        // int bitMask = 1<<x;

        // if( (6 & bitMask) == 0)
        // {
        //     System.out.println("0");
        // }
        // else
        // {
        //     System.out.println("1");
        // }

        //clear the ith bit

        int bitmask = 1 << x;

        //Clear the ith bit 
        int result  = clearIthBit(10,bitmask);
        System.out.println(result);
    }
}
