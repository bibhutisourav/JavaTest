// ******************************************
/*
 * **********************************************
 * *******************************
 * *******************************************
 * ###################################
 */
public class ArrayMultidimensional 
{
public static void main(String[] args) 
{
 
 int [][] a = { 
                {1,2,0,1,2},
                {4,5,0,1,2}
              };

int max_count = 0 ; int ans = -1 ;
for (int row = 0; row < a.length; row++) 
{
  int count = 0 ;
  for (int column = 0; column < a.length; column++) 
  {
      if (a[column][row] == 0) 
      {
        count++ ;
      }
  }    

if (count > max_count)
{ 
    max_count = count ;
    ans = row;
}
System.out.println(ans);
}


} 


}
