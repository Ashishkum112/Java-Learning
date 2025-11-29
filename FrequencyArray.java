import java.util.ArrayList;
import java.util.List;

public class FrequencyArray {

    public static List<List<Integer>> countFreq(int nums[],int n)
    {
        boolean visited_array[] = new boolean[n];

        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(visited_array[i])
            {
                continue;
            }

            int count = 1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    visited_array[j] = true;
                    count++;
                }
            }
            List<Integer> inner_list = new ArrayList<Integer>();
            inner_list.add(nums[i]);
            inner_list.add(count);
            li.add(inner_list);
        }
        return li;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        // Create Solution instance

        // Call the function to count frequencies
        List<List<Integer>> li = countFreq(arr, n);
        System.out.println(li);
    }
}
