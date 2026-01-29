public class QuickSort {
    public static void quickSortAlgo(int arr[],int startIndex,int endIndex)
    {
        if(startIndex >= endIndex)
        {
            return ;
        }
        int pI = partition(arr,startIndex,endIndex);
        quickSortAlgo(arr, startIndex, pI - 1);
        quickSortAlgo(arr, pI + 1 , endIndex);
    }

    public static int partition(int arr[],int startIndex,int endIndex)
    {
        int pI = arr[endIndex];
        int i = startIndex-1;
        for(int j = startIndex; j<endIndex; j++ )
        {
            if(arr[j] <= pI)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
         //swap
        int temp = pI;
        arr[endIndex] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,2,5};
                //   2,3,5,6,9
        quickSortAlgo(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
