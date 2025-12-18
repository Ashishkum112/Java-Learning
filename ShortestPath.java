public class ShortestPath {

    public static float findShortestPath(String path)
    {
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++)
        {
            char c = path.charAt(i);
            if(c == 'N')
            {
                y++;
            }
            else if(c == 'S')
            {
                y--;
            }
            else if(c == 'E')
            {
                x++;
            }
            else if(c == 'W')
            {
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
        // return displacement;
    }

    public static void main(String[] args) 
    {
        String path = "NS";
        // System.out.println(findShortestPath(path));

        String name = "Hello World";
        String fruits[] = {"apple","banana","mango"};
        String largest = fruits[0];

        System.out.println(name.substring(0,5));

        for(int i = 1;i< fruits.length;i++)
        {
            if(largest.compareTo(fruits[i]) < 0)
            {
                largest = fruits[i];
                System.out.println("loop started");
            }
        }
        // System.out.println(largest);

        String str = "Ashish";
        for(char c = 'a';c <= 'z';c++)
        {
            str+= c;
        }
        System.out.println(str);


    }
}
