public class MergeSort{
    public static void mergeSortAlgo(int arr[],int sI,int eI)
    {
        if(sI >= eI)
        {
            return;
        }
        int middleIndex = sI + ( eI - sI)/2;
        mergeSortAlgo(arr, sI, middleIndex);
        mergeSortAlgo(arr, middleIndex +1, eI);
        merge(arr, sI, eI,middleIndex);
    }
    public static void merge(int arr[],int sI,int eI,int mI)
    {
        int tempArray[] = new int[eI - sI + 1];
        int i = sI;
        int j = mI + 1;
        int k = 0;
        while (i <= mI && j <= eI) 
            {
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
            while (i <= mI) 
            {
                tempArray[k] = arr[i];
                i++;
                k++;
            }
            while (j <= eI) 
            {
                tempArray[k] = arr[j];
                j++;
                k++;
            }   

            for(k=0,i = sI; k<tempArray.length;k++,i++)
            {
                arr[i] = tempArray[k];
            }
            }




    public static void main(String[] args) {
        int arr[] = {4,5,1,8,6,3};
        //           1,3,4,5,6,8
        int startIndex = 0;
        int endingIndex = arr.length - 1;

        mergeSortAlgo(arr,startIndex,endingIndex);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "     ");
        }
    }
}