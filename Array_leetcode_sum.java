public class Array_leetcode_sum
{
// que_1
public static void main(String[] args) 
{
    int [][] account = { {4,5,100}, 
                         {1,2}};

  int x = maximumWealth(account); 
  System.out.println(x);
 
}

private static int maximumWealth(int[][] account) 
{
  int sum = 0, max = 0 ;
  for (int user = 0; user < account.length; user++) 
  {
    sum = 0 ;
    for (int bank = 0; bank<account[user].length; bank++) 
    {
        sum=sum+account[user][bank];
    }    
  if (sum > max) max=sum;
  }
  return max ;
}
}
  
