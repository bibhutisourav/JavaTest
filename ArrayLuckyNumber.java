public class ArrayLuckyNumber 
{
 public static void main(String[] args) 
 {
      int[][] matrix = {{3,7,8},
                        {9,11,13},
                        {15,16,17}};                      
        SearchingMinMax(matrix);   
 }   
  public static void SearchingMinMax(int[][] array) 
  {
    int min = Integer.MAX_VALUE;
    int column = 0 ;
    for (int i = 0; i < array.length; i++) 
    {
     for (int j = 0; j < array[i].length; j++) 
     {
       if (min>array[i][j]) 
       {
        min = array[i][j];
        column = j ;
       }   
     }     
    // System.out.println(min);
    boolean is_lucky = true ;
    for (int k = 0; k < array.length; k++) 
    {
      if (min<array[k][column]) 
      {
        min = array[k][column]; 
        is_lucky = false;
        break ;    
      }    
    }
    // System.out.println(min);  
    if (is_lucky) 
    {
        System.out.println(min);
    }
  }
}
}