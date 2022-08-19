public class Array_leetcodeTarget 
{
    public static void main(String[] args) 
    {
             
    }   

public static int[] taget(int[] nums, int[] index) 
{
 int[] target = new int[nums.length] ;  
 
 for (int i = 0; i < nums.length; i++) 
 {
    for (int j = 0; j < index.length; j++) 
    {
      target[i]++ ;    
      target[j]++ ;    
    }
 }

 return target;
}


}
