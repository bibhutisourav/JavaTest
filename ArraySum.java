import java.util.Arrays;

public class ArraySum 
{
 public static void main(String[] args) 
 {
  int[] nums = {1,2,3}; 
  runningSum(nums);

  System.out.println(Arrays.toString(nums)); 

 }
 
public static int[] runningSum(int[] nums) 
 {
    for(int i=0;i<nums.length-1;i++)
    {
        nums[i+1]+=nums[i];
    }
    return nums ;
}    
      
 }



