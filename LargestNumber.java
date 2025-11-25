public class LargestNumber {
    public static void main(String[] args) {
        int numbers[] = {14,1,2,3,4,54,34,636,356,35654,64};
        int max = numbers[0];
        int second_max = 0;
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i] > max)
            {
                second_max = max;
                max = numbers[i]; //54
            }
            else if(numbers[i] < max && second_max > max)
            {
                second_max = numbers[i]; //
            }
        }
        System.out.println("Max num is : " +max);
        System.out.println("Second Max is : " +second_max);
    }
}
