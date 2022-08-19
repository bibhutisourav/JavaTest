public class ArrayTranspose2 
{
    public static void main(String[] args) 
    {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        
        result_matrix(matrix);   
        
        System.out.print("Modified matrix is \n");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        } 
        
    }
    
    public static int[][] result_matrix(int[][] matrix) 
    {
      int R = matrix.length ;
      int C = matrix[0].length ;
      int[][] transpose = new int[R][C];

      for (int row = 0; row < R; row++) 
      {
        for (int column = 0; column < C; column++) 
        {
           transpose[R][C] = matrix[C][R] ;         
        }  
      }
      return transpose;
    }
}
