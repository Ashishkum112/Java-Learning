public class SubArray {
    public static void printSubArrays(int numbers[])
    {
        int number_SubArray = 0;
        int max_sum = 0;
        int min_sum = numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                int sum = 0;
                for(int k = i;k<=j;k++)
                {   
                    System.out.print(numbers[k] +" ");
                    sum +=numbers[k];
                }
                number_SubArray++;
                System.out.println(" -->> Current Sum is : "  +sum);
                if(sum > max_sum)
                {
                max_sum = sum;
                }
                System.out.println();
            }
        }
        System.out.println("Number of Sub-Arrays are : " +number_SubArray);
        System.out.println("The Max Sub Array Sum is : " +max_sum);
        // System.out.println("The Min Sub Array Sum is : " +min_sum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,-4,6,8,-10,1};

        printSubArrays(numbers);
    }
}
