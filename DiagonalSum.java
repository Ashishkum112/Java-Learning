public class DiagonalSum {
    public static void main(String[] args) {
        int matrix1[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                        };

         int matrix[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}
                        };               
        
    int sum = 0;                    
    for(int i = 0 ;i<matrix.length;i++)
    {
        sum+= matrix[i][i];
        if(i == matrix.length - 1 - i)
        {
            //
        }
    }
    System.out.println("The sum of the diagonal is " +sum);
    }
}
