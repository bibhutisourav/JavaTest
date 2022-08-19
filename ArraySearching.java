import java.util.Scanner;

public class ArraySearching 
{
public static void main(String[] args) 
{
  Scanner io = new Scanner(System.in) ;
  int t = io.nextInt() ;
  while (t-->0) 
  {
    search() ;  
  }
  
}
public static void search() 
{
    Scanner io = new Scanner(System.in) ;
    int start= io.nextInt() ;
    int end = io.nextInt() ;
    int count = 0 ;
    for (int i = start; i <= end; i++) 
    {
      int rem = i%10 ;
      if (rem==2||rem==3||rem==9)
      {
        count++ ;
      }
    }
    System.out.println(count);
}    
}
// 2
// 1 10
// 11 33
