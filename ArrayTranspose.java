/*
 * running for only n*n matrix.
 *this code is also for rotation of array in right side. 
 */
import java.util.Arrays;

public class ArrayTranspose 
{
  public static void main(String[] args) 
  {
    int[][] matrix = {{1,2,3},
                      {5,6,7},
                      {9,10,11}};
    transpose(matrix) ; 
    System.out.print("Modified matrix is \n");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        } 
  }

  public static void transpose(int[][] matrix) 
  {  
    for (int row = 0; row < matrix.length; row++) 
    {
      for (int column = row+1; column < matrix.length; column++) 
      { 
        matrix[row][column]^=matrix[column][row] ;   
        matrix[column][row]^=matrix[row][column] ;   
        matrix[row][column]^=matrix[column][row] ;       
      }   
    }                            
  }
}
