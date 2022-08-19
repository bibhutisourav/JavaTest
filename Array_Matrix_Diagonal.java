/*
 this question is n*n matrix
 */
public class Array_Matrix_Diagonal 
{
    public static void main(String[] args) 
    {
      int[][] matrix_1  = {{4,5,5,1},
                           {7,8,5,1},
                           {1,2,3,4}, 
                           {0,0,5,1}}; 
  
      diagonal(matrix_1) ;  
    }    
    
    public static void diagonal(int[][] array) 
    {
      for (int i = 0; i < array.length; i++) 
      { 
        // printing right hand diagonal
        System.out.print(array[i][array.length-i-1] + " ");  
      }    
      System.out.println();
      for (int j = 0; j < array.length; j++) 
      {
        // printing left hand diagonal 
        System.out.print(array[j][j] + " "); 
      }
    }    
}
