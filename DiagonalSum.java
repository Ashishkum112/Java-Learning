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
        
        int n = matrix.length ;
        int left_pointer = matrix.length;
        int right_pointer = 1;
        int primary_sum = 0;
        int secondary_sum = 0;
        int same_index = 0;

        while (left_pointer > 0 && right_pointer <= n ) {
            
            primary_sum = primary_sum + matrix[n-left_pointer][n- right_pointer];
            // secondary_sum = secondary_sum + matrix[n- right_pointer][n-left_pointer];
            if()
            {
                secondary_sum = secondary_sum + matrix[same_index][same_index];
            }
            left_pointer--;
            right_pointer++;
            same_index++;
        }
        System.out.println("The primary diagonal Sum is : " +primary_sum);
        System.out.println("The secondary diagonal Sum is : " +secondary_sum);
    }
}
