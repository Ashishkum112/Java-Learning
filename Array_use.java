import java.util.*;

public class Array_use{
    public static void main(String[] args){
        int[] new_Array = {1,2,3,23,23,23,2332,23,33,434,123,23,4};
        Arrays.sort(new_Array);
        for(int i=0;i<new_Array.length;i++)
        {
            System.out.println(new_Array[i]);
        }
    }
}
