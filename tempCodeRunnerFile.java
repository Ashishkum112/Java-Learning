


public class ArrayDemo {

    public int LinearSearch(){

    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};
        int key = 9;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i] == key )
            {
                System.out.println("Key found at " +i );
            }
            else
                System.out.println("Not found");
        }
    }
}
