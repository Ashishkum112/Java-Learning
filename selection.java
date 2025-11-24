public class selection {
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,4,5,3,1};
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[smallest])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        display(arr);
    }
}
