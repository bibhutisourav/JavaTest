public class ArrayEvenDigit 
{
  public static void main(String[] args) 
  {
    findnumbers();  
  }    
  
  public static void findnumbers() 
  {
   int[] array = {12,6,456} ;
   int count = 0 ;
   
   for (int num : array) 
   {
    int digit = 0 ;
    while (num>0) 
    { 
      digit++ ;
      num/=10 ;   
    }         

    if ((digit%2)==0)  
      {
        count++ ;        
      }

   }    
    System.out.println("ans = "+ count);
}
}


