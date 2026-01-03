public class ReverseWords {
    public static void main(String[] args) {
        String str = "   Hello     World    ";

        String trimmedString = str.trim(); 
         System.out.println(trimmedString);
        
        String arr_str[] = trimmedString.split("\\s+");
        for( String x : arr_str)
        {
            System.out.print(x+",");
        }

        System.out.println();
        int i = 0;
        int j = arr_str.length - 1;

        while( i < j)
        {
            String temp = arr_str[i];
            arr_str[i] = arr_str[j];
            arr_str[j] = temp;
            i++;
            j--;
        }
        for( String x : arr_str)
        {
            System.out.print(x+",");
        }
        String str1 = String.join(" ", arr_str);
        System.out.println();
        System.out.println(str1);
    }
}
