import java.util.HashMap;
import java.util.*;

public class StoboGrammatic {
    public static void main(String[] args) {
        Map<Character,Character> hmap = new HashMap<>();
        hmap.put('0','0');
        hmap.put('1','1');
        hmap.put('8','8');
        hmap.put('6','9');
        hmap.put('9','6');

        boolean flag = true;
        String str = "1691";
        //                  i
        //                j         
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            char l = str.charAt(i);
            char r = str.charAt(j);

            if(hmap.containsKey(l))
            {
                if(hmap.get(l) != r)
                {
                    System.out.println("Not a stobographic num");
                    flag = false;
                    break;
                }
                else
                {
                    i++;
                    j--;
                }
            }
            else{
                System.out.println("Not a stobographic num");
                flag = false;
                break;
            }
        }
        if(flag)
        {

            System.out.println("It is stobographic Number");
        }
    }
}
