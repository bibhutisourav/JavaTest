import java.util.Arrays;

/**
 * Array_leetcode_oddvalue
 */
public class Array_leetcode_oddvalue 
{
public static void main(String[] args) 
{
  int[][] indices = {{1,2,3},
                     {4,5,6}} ;    
   int count = 0 ; 
   for (int row = 0; row < indices.length; row++) 
   {
     for (int column = 0; column < indices[row].length; column++) 
     {
       indices[row][column]++ ;

       if (indices[row][column]%2 != 2) 
       {
         count++ ; 
       }
 

        System.out.print(indices[row][column] + " ");
     }
     System.out.println(""); 
   }
  
}
    
}