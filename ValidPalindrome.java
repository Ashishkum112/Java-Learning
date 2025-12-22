public class ValidPalindrome {

    public static boolean isPalindrome(String s) 
    {
        int start = 0;
        int end = s.length() - 1;
       
        while(start <= end)
        {
            char left = s.charAt(start);
            char right = s.charAt(end);
            if(!Character.isLetterOrDigit(left))
            {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(right))
            {
                end--;
                continue;
            }
            if(Character.toLowerCase(left) != Character.toLowerCase(right))
            {
                return false;
            }
            start++;
            end--;
            
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
}

