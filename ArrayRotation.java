public class ArrayRotation 
{
 public static void main(String[] args) 
 {
    int[][] array  = {{0,1},
                      {1,0}} ;

    int[][] target = {{1,0},
                      {0,1}} ;

    rotated(array);
    
    System.out.print("Modified matrix is \n");
    for (int i = 0; i < array.length; i++)
    {
        for (int j = 0; j < array.length; j++)
        System.out.print(array[i][j] + " ");
        System.out.print("\n");
    } 

    check(array, target);
}
                        
 
 public static void rotated(int[][] matrix) 
 {    
    for (int i = 0; i < matrix.length; i++) 
    {
      for (int j = i+1; j < matrix.length; j++) 
      {
        matrix[i][j]^=matrix[j][i]; 
        matrix[j][i]^=matrix[i][j]; 
        matrix[i][j]^=matrix[j][i]; 
      }    
    }                        
 }
 
 public static void check(int[][] array_1, int[][] array_2) 
 {
   for (int i = 0; i < array_1.length; i++) 
   {
    for (int j = 0; j < array_2.length; j++) 
    {
        if (array_1[i][j] == array_2[j][i])
        break ;      
    } 
   } 
 }
 
}
