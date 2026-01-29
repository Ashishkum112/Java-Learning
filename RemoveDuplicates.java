public class RemoveDuplicates {

    public static void handleDuplicates(String str,StringBuilder sb,int index,boolean map[])
    {
        if(index == str.length())
        {
            System.out.println(sb.toString());
            return;
        }
        char ch = str.charAt(index);
        if(map[ch - 'a'] == true)
        {
            handleDuplicates(str, sb, index + 1, map);
        }
        else
        {
            map[ch - 'a'] = true;
            handleDuplicates(str, sb.append(ch), index + 1, map);
        }
    }
    public static void main(String[] args) {
        String str = "abcda";
        boolean map[] = new boolean[26];
        handleDuplicates(str,new StringBuilder(""),0,map);
        // System.out.println();
        StringBuilder sb1 = new StringBuilder("");
        for(int i = 0;i<map.length;i++)
            {
                if(map[i] == true)
                {
                    // char c = ;
                    System.out.println((char)('a' + i));
                    sb1.append((char)('a' + i));
                }
            }
            System.out.println(sb1.toString());
    }
}
