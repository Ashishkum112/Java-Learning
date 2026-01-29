public class FiboUsingRecursion {
    
    public static int printNthFib(int n)
    {
        if(n<2)
        {
            return n;
        }
        return printNthFib( n - 1) + printNthFib(n - 2);
    }
    public static void main(String[] args) {
        
        int n = 4;

        System.out.println(printNthFib(n));
    }
    // 0,1,1,2,3,5
    // 0,1,2,3,4,5
}
