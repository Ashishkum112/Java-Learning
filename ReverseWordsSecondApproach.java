public class ReverseWordsSecondApproach {

    public static void reverseString(StringBuilder sb,int start,int end)
    {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        String str = "    Hellloo    Worldd   ";

        StringBuilder sb = new StringBuilder();

        int l = 0;
        int r = str.length() - 1;

        //"    Hellloo Worldd   "
        //     l
        //                  r   
        while( l < str.length() - 1)
        {
            if(str.charAt(l) == ' ')
            {
                l++;
            }
            else{
                break;
            }
        }
        while( r >= 0)
        {
            if(str.charAt(r) == ' ')
            {
                r--;
            }
            else
            {
                break;
            }
        }
        //"Helloo    Worldd"
        //                  l
        //                 r
        //sb -> Helloo Worldd
        //Now Taking out the spaces in between two words
        while(l <= r)
        {
            if(str.charAt(l) != ' ')
            {
                sb.append(str.charAt(l));
                l++;
            }
            else if(str.charAt(l) == ' ')
            {
                if((sb.charAt(sb.length() - 1)) != ' ')
                {
                    sb.append(str.charAt(l));
                    l++;
                }
                else{
                    l++;
                }
            }
        }


        int i = 0;
        int j = sb.length() - 1;
        System.out.println(sb);
        reverseString(sb,i,j);
        System.out.println(sb);

        int start = 0;
        int end = 0;

        //ddlroW oollleH
        //       i
        //             j
        //
        while( start < sb.length())
        {
            while (end < sb.length() && sb.charAt(end) != ' ') {
                end+=1;
            }
            reverseString(sb, start, end-1);
            start = end+1;
            end = start;
        }

        System.out.println(sb);
    }
}
