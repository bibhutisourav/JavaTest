/**
 * ArrayDublicate
 */
public class ArrayDublicate 
{
public static void main(String[] args) 
{
    int[] array = {4,3,2,7,8,2,1};
    int x = 0 ;
    for (int i = 0; i < array.length; i++) 
    {
      x=x^array[i];
    }
    for (int i = 0; i < array.length; i++) 
    {
     x=x^i; //x=x^i;    
    }
    System.out.println(x);
 
    // dublicate(arr);
    an();
}
  public static void dublicate(int[] array) 
  {
    int x = 0 ;
    for (int i = 0; i < array.length; i++) 
    {
        x^=array[i];
    }
    for (int i = 0; i < array.length; i++) 
    {
     x^=i;    
    }
    System.out.println(x);
  }
  public static void an() 
  {
    int[] a={601,602,603,604,605,605,606,607};
    int k,i,j=601;

    for(i=602;i<=607;i++)
    {
        j=j^i;
    }

    for(k=0;k<8;k++)
    {
        j=j^a[k];
    }

    System.out.println(j);
  }
     
  }  
