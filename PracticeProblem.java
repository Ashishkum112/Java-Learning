public class PracticeProblem {
    public static void main(String[] args) {
        String sentence = "hi, ashish HERE";
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(sentence.charAt(0)));
        for(int i=1;i<sentence.length();i++)
        {
            if(sentence.charAt(i) == ' ')
            {
                sb.append(sentence.charAt(i));
                i+=1;
                sb.append(Character.toUpperCase(sentence.charAt(i)));
            }
            else
            {
                sb.append(sentence.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
