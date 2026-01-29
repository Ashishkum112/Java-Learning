public class MergeSort {
    public static void MergeSortAlgo(int arr[],int startIndex,int endIndex)
    {
        if(startIndex >= endIndex)
        {
            return;
        }
        int middleIndex = startIndex + ( endIndex - startIndex) / 2;
        MergeSortAlgo(arr, startIndex, middleIndex);
        MergeSortAlgo(arr, middleIndex+1 , endIndex);
        merge(arr,startIndex,endIndex,middleIndex);
    }
    public static void merge(int arr[],int startIndex,int endIndex,int middleIndex)
    {
        int i = startIndex;
        int j = middleIndex + 1;
        int k = 0;  
        int tempArray[] = new int[endIndex - startIndex + 1];  // 3-0+1

        while (i <= middleIndex && j <= endIndex) {
            if(arr[i] < arr[j])
            {
                tempArray[k] = arr[i];
                i++;
            }
            else
            {
                tempArray[k] = arr[j];
                j++;
            }
            k++;
        }
        while( i <= middleIndex)
        {
            tempArray[k] = arr[i];
            i++;
            k++;
        }
         while( j <= endIndex)
        {
            tempArray[k] = arr[j];
            j++;
            k++;
        }

        i = startIndex;
        for(int s = 0; s<tempArray.length;s++,i++)
        {
            arr[i] = tempArray[s];
        }
        printarr(arr, startIndex, endIndex);
        
    }
    public static void printarr(int arr[] , int startIndex,int endIndex)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println("Recursion");
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        MergeSortAlgo(arr,0,arr.length - 1);
        printarr(arr,0,arr.length);
    }
}