public class BinaryStringConsZero {
    public static void main(String[] args) {
        // int n = 3;
        checkFun(3, 0, "");
    }

    //Base Case
    //Output
    // n = 3
    // call for n-1 = 2 "0"
    // n = 2 
    // call for n-1 = 1 "00"
        // n = 1
        // call for n-1 = 0 "000"
        // n = 0 return ;
        
        //lp= 0
        //3-1 = 2 
        //for 2 => "1"
        //
        
        public static void checkFun(int n,int LastPlace,String str){
        if( n == 0)
        {
            System.out.println(str);
            return;
        }
        //Work
        checkFun(n-1, 0, str+"0");
        if(LastPlace == 0)
        {
            checkFun(n-1, 1, str+"1");
        }
    }
}
