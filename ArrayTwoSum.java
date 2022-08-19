public class ArrayTwoSum 
{
  public static void main(String[] args) 
  {
    sum();
  } 
  public static int[] sum(int[]array ,int target) 
  {
    for (int i = 0; i < array.length-1; i++) 
    {
        for (int j = i+1; j < array.length; j++) 
        {
          if (array[i]+array[j] == target)
          {
           return new int[]{i,j} ;
          }   
        }      
    }
    return null ;
  }   
}
