import java.util.Arrays;

/**
 * ArrayLeetCodeTarget
 */
public class ArrayLeetCodeTarget 
{
public static void main(String[] args) 
{
    int[] indx = {0,1,2,2,1} ;
    int[] arr = {0,1,2,3,4} ;
    createTargetArray(indx, arr);    
}
public static void createTargetArray(int[] index, int[] nums) 
{
    
    int[] target = new int[index.length] ;
    for (int i = 0; i < index.length; i++) 
    {
      for (int j = i; j > index[i]; j--) 
      {
       target[j] = target[j-1] ;  
      }
      target[index[i]] = nums[i] ;
    }
    System.out.println(Arrays.toString(target));
}    
}