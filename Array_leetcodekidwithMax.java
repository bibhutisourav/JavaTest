import java.util.Arrays;
public class Array_leetcodekidwithMax 
{
  public static void main(String[] args) 
  {
    int[] candies = {5,6,3,1} ;
    boolean max = false; 
    for (int i = 0; i < candies.length; i++) 
    {
      int extra = candies[i] + 3;
      for(int j = 0; j < candies.length; j++) 
      {
        if(extra >= candies[j]) 
        {
          max = true;
        } 
        else 
        {
          max = false;
          break;
        }    
      }
      System.out.println(extra);
      System.out.println(max);
    } 
  // System.out.println(extra); 
   
}
}