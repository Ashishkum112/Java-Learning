

public class SortTwoColours {
    
public static void main(String[] args) {
    int arr[] = {1,1,1,1,0,0,1,1,0,1,0};
    int i = 0;
    int j = arr.length - 1;

    //int arr[] = {0,0,0,0,1,1,1,1,1,1,1};
    //                     i
    //                   j
    while(i <= j )
    {
        if( arr[i] == 0)
        {
            i++;
        }
        else
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
    }
    
    for (int x : arr) {
        System.out.print(x + ",");
    }

}
}
