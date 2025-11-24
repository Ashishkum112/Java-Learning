import java.util.HashMap;
import java.util.Map;

public class hash_practice {
 public static void main(String[] args) {
    HashMap<String,Integer> mp = new HashMap<>();

    mp.put("China",100);
    mp.put("India",200);
    mp.put("US",300);

    System.out.println(mp);

    //Search

    // if(mp.containsKey("China"))
    // {
    //     System.out.println("Present");
    // }
    // else
    // System.out.println("Not present");

    //Forloop

    // for(Map.Entry<String,Integer> e : mp.entrySet())
    // {
    //     System.out.println(e.getKey());
    //     System.out.println(e.getValue());
    // }
 }   
}
