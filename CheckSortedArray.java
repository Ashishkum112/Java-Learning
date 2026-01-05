public class CheckSortedArray {

    public static boolean isSortedArray(int arr[],int i)
    {
        if(i == arr.length - 1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return isSortedArray(arr, i+1);
        
    }
    public static void main(String[] args) {
        int arr[] = {2,23,4,5,3,6,7};
        int arr1[] = {1,2,3,4,5,1};

        boolean flag = isSortedArray(arr1,0);
        if(flag)
        {
        System.out.println(flag);
        }
        else
        {
            System.out.println(flag);
        }

    }
}
