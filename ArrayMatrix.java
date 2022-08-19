public class ArrayMatrix 
{
public static void main(String[] args) 
{
    int[][] matrix_1  = {{4,5,6},
                         {7,8,9},
                         {0,0,0}}; 

    int[][] matrix_2  = {{4,5,6},
                         {7,8,9}}; 

    int[][] result  = {{0,0,0},
                       {0,0,0}}; 
 
 for (int a = 0; a < matrix_1.length; a++) //row
 {
    for (int b = 0; b < matrix_1[a].length; b++) //column
    {
      result[a][b] = matrix_1[a][b] + matrix_2[a][b];
      System.out.print(result[a][b] + " ");
    }   
    System.out.println(""); 
 }       

}    
}
