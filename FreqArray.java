import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqArray {

    public static Map<Integer,Integer> countFreq(int nums[],int n)
    {
        // boolean visited_array[] = new boolean[n];

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 1;

        for(int i = 0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        return map;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        // Create Solution instance

        // Call the function to count frequencies
        Map<Integer,Integer> map = countFreq(arr, n);
        System.out.println(map);
    }
}
