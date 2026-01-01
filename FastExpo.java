public class FastExpo {
        public static void main(String[] args) {
            
            int n = 5;
            int a = 3;

            int ans = 1;

            // n = 5 
            //101 -> First Iteration
            // 010 -> Second Iteration
            // 001 -> Third Iteration
            

            //ans = 243
            //a= 81*81;

            while(n > 0)
            {
                if((n & 1) != 0)
                {
                    ans = a * ans;
                }
                a = a*a;
                n = n>>1;
            }
            System.out.println(ans);
            
        }
}
