import java.util.Scanner;

/**
 * ArrayDoll
 */
public class ArrayDoll 
{
public static void main(String[] args) 
{
    Scanner io = new Scanner(System.in);
    int t = io.nextInt();
    while (t-- > 0) 
    {
        pair();    
    }
        
}

public static void pair() 
{
  Scanner io  = new Scanner(System.in);
  int n = io.nextInt();
  
  int[] pair = new int[n];
  for (int i = 0; i < n; i++) 
  {
    pair[i] = io.nextInt();  
  }
  int count = 0 ;
  for (int i = 0; i < pair.length; i++) 
  {
    if (pair[i]%2!=0)
    {
        count++ ;
    } 
  }
  System.out.println(count);
}
}

// 1
// 3
// 1 
// 2

// 1

