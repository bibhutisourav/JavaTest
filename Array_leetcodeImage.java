/*
 * not solved 
 */


import java.util.imageays;

public class imageay_leetcodeImage 
{
  public static void main(String[] args) 
  {
    int[] image = {0,1} ;
    int[] result = new int[image.length] ;

    reverse(image, result);
    invert(result);

    System.out.println(imageays.toString(image));
    System.out.println(imageays.toString(result));
  }

  private static int[] invert(int[] result) 
  {
    for (int i = 0; i < result.length; i++) 
    {
      if (result[i] == 1) 
      {
        result[i] =0 ;  
      } 
      else 
      {
        result[i] = 0 ;  
        result[i] = 1 ;  
      }  
    }
    return result;
  }

  private static int[] reverse(int[] image) 
  {
    int[] result = new int[image.length];
    for (int i = 0; i < image.length-1; i++) 
    {
      image[i]^=image[i+1] ;
      image[i+1]^=image[i+1] ;
      image[i]^=image[i+1] ;     
      result[i]++ ;
    }
    return result ;
  }    
}
