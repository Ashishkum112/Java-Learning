public class merge {
    public static void display(int[] arr,int start,int end)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void conquer(int arr[],int start,int mid,int end)
    {
        int[] merged_array = new int[end-start+1];
        int low = start;
        int high = mid+1;
        int x=0;

        while (low<= mid && high <=end )
        {
            if(arr[low] < arr[high])
            {
                merged_array[x]=arr[low];
                x++;low++;
            }
            else
            {
                merged_array[x]=arr[high];
                x++;high++;
            }
        }
        while(low<=mid)
        {
            merged_array[x]=arr[low];
            x++;low++;
        }
        while (high <= end) {
            merged_array[x]=arr[high];
            x++;high++;
        }
        for(int i=0,j=start;i<merged_array.length;i++,j++){
            arr[j] = merged_array[i];
        }
    }

    public static void divide(int arr[],int start,int end)
    {
        if(start >= end)
        {
            return;
        }
        int mid = start + (end - start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr,start,mid,end);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int start = 0;
        int end = arr.length - 1;
        divide(arr,start,end);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
