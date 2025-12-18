public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}
                        };
        int tMatrix[][] = new int[3][3];               

        for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(i <= j )
                {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        //display
        for(int i = 0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j] + " ,");
            }
            System.out.println();
        }
    }
}
