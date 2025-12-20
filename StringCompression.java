public class StringCompression {

    public static StringBuilder compressMethod(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i = 0;i<str.length();i++)
        {
            sb.append(str.charAt(i));
            Integer count = 1;
            while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {   
                count++;
                i++;
            }
            if(count > 1)
            {
                sb.append(count);
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        String str = "aaaabbbbccddd"; 
        String str1 = "aaabc";
        StringBuilder result = compressMethod(str1);
        // System.out.println(result);

        String str2 = "ApnaCollege".replace("1", "");
        System.out.println(str2);
    }
}
