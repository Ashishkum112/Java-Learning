import java.util.Scanner;

public class ConvertCase {

    public static StringBuilder checkCase(String str)
    {
        StringBuilder str_lower = new StringBuilder("");

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {  
                // ch = (char) (ch+32);
                System.out.println(ch);
                str_lower.append(str.toLowerCase());
            }
            else
            {
                str_lower.append((char)ch);
            }
        }
        return str_lower;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder str_lower = new StringBuilder("");

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {  
                // ch = (char) (ch+32);
                System.out.println(ch);
                str_lower.append((char) (ch + 32));
            }
            else
            {
                str_lower.append((char)ch);
            }
        }
        //System.out.println(str_lower);
        str = str.toLowerCase();
        System.out.println(str);
        sc.close();;


    }
}
