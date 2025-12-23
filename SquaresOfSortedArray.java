

public class SquaresOfSortedArray {
    
    public static int[] sortedSquares(int nums[])
    {
        int start  = 0;
        int end = nums.length - 1;
        int k = nums.length - 1;
        int result[] = new int[k+1];

        while (start <= end && k>=0) {
            int current_left = (nums[start] * nums[start]);
            int current_right = (nums[end] * nums[end]);

            if(current_left <= current_right)
            {
                result[k] = current_right;
                end--;
                k--;
            }
            else if( current_left > current_right)
            {
                result[k] = current_left;
                start++;
                k--;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        int arr[] = {-7,-3,2,3,11};
                  //  16,1,0,9,100 
                  //  100            //1
                  //  16,100        //2
                  //  1,9,16,100     //3
                  //  0,1,9,16,100   //4
        int result[] = sortedSquares(arr);
        
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] +",");
        }
    }
}
