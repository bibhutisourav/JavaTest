import java.util.Arrays;

/**
 * Array_leetcode_Good_Pairs
 */
public class Array_leetcode_Good_Pairs 
{
 public static void main(String[] args) 
 {
    int[] nums = {1,9,3,4} ; 
    aray(nums);     
 }

private static int[] aray(int[] nums) 
{
 int[] result = new int[nums.length] ;
 // int count = 0 ; 
  for (int i = 0; i < nums.length; i++) 
  {
     for (int j = 0; j < nums.length; j++) 
     {
         if (nums[i]>nums[j]) 
         {
           result[i]++ ;    
         } 
     }  
  }
  return result;
}


}