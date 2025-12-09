public class MaxSubArray {

    public static int kadaneAlgo(int arr[])
    {

        int current_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < 0 )
            {
                count++;
                
            }
        }
        if(count == arr.length)
        {
            return 0;
        }

        for(int i=0;i<arr.length;i++)
        {
            current_sum = current_sum + arr[i];
            if(current_sum < 0)
            {
                current_sum = 0;
            }
            maximum_sum = Math.max(current_sum,maximum_sum);
        }

        return maximum_sum;
    }
    public static void main(String[] args) {
        // int array[] = {-2,-3,4,-1,-2,1,5,-3};
        int array[] = {-1,2,-1,2,-1};
        // int array[] = {-1,-2,-3};
        System.out.println("The maximum sub array is : " +kadaneAlgo(array));
    }
}
