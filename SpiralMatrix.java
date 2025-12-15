

public class SpiralMatrix {
    public static void main(String[] args) {
       int matrix[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
       
       //to print Spiral Matrix 

       int startRow = 0;
       int endRow = matrix[0].length - 1;
       int startColumn = 0;
       int endColoumn = matrix[0].length - 1;

       while( startRow <= endRow && startColumn <= endColoumn)
        {
            //Top Most Boundary
            for(int i=startRow;i<endColoumn+1;i++)
            {
                System.out.print(matrix[startRow][i] +" ");
            }
            //Right Boundary
            for(int j=startRow+1;j<endRow+1;j++)
            {
                System.out.print(matrix[j][endColoumn] + " ");
            }
            //Bottom Boundary
            for(int i=endColoumn-1;i>=startColumn;i--)
            {
                //very important
                if(startRow == endColoumn) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            //Left Boundary 
            for(int j=endRow-1;j>startRow;j--)
            {
                if(startColumn == endColoumn)
                {
                    break;
                }
                System.out.print(matrix[j][startColumn] + " ");
            }
            //End Condition
            startRow++;
            endRow--;
            startColumn++;
            endColoumn--;
        } 

        System.out.println(" \n The matrix is \n");
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
