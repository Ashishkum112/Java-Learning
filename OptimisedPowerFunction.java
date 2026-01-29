public class OptimisedPowerFunction {

    public static int checkPower(int a,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int halfPower = checkPower(a, n/2);
        int halfPowerSquare = halfPower * halfPower;
        if( n % 2 != 0)
        {
            halfPowerSquare = a * halfPowerSquare; 
        }

        return halfPowerSquare;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;

        System.out.println(checkPower(a,n));
    }
}
