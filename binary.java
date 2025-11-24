import java.util.Scanner;

public class binary 
{
    public static int Binary_Search(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while( start <= end )
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid+1;
            }
            else if(arr[mid] > target)
            {
                end = mid-1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to search");
        int target  = sc.nextInt();
        int ans= Binary_Search(arr,target);
        if(ans == -1 )
        {
            System.out.println("Not FOund");
        }
        else
        {
            System.out.println("Found at : " + ans);
        }
    }
}
