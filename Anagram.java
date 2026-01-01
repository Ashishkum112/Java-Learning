import java.util.Arrays;

public class Anagram {

    public static boolean searchAnagram(String s1,String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.println("Converting into char ");
        //convert these inputs 
        char ch1 [] = s1.toCharArray();
        char ch2 [] = s2.toCharArray();

        if(ch1.length == ch2.length)
        {
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2))
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {

        String s1 = "earth";
        String s2 = "heart";


        boolean result = searchAnagram(s1,s2);
        if(result)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }
    }
}
