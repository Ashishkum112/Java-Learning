public class RainWaterTrapped {
    public static int findTrappedWater(int rain_array[])
    {
        int n = rain_array.length;
        //1.Calculate the auxilarry array of Left Max Boundary
        int left_max[] = new int[n];
        left_max[0] = rain_array[0];
        for(int i=1;i<n;i++)
        {
            left_max[i] = Math.max(left_max[i-1], rain_array[i]);
        }

        //2.Calculate the auxilarry array of Right Max Boundary
        int right_max[] = new int[n];
        right_max[n-1] = rain_array[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_max[i] = Math.max(right_max[i+1], rain_array[i]);
        }

        //WaterLevel = Min(Left Max Array,Right Max Array)
        //TrappedWater+ = WaterLevel - Height;

        int trappedWater = 0;
        for(int i=0;i<n;i++)
        {
            int WaterLevel = Math.min(left_max[i],right_max[i]);
            trappedWater+= (WaterLevel-rain_array[i]); 
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int rain_array[] = {4,2,0,6,3,2,5};

        int trappedWater = findTrappedWater(rain_array);

        System.out.println("The Trapped Rain water is : " +trappedWater);

    }
}
