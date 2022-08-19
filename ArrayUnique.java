public class ArrayUnique 
{
 public static void main(String[] args) 
 {
   int[] arr = {1,2,1,3,3,4};
   usingxor(arr) ;
    
 }   
 public static void usingxor(int[] array) 
 {
   int ans = 0 ;
   for (int i = 0; i < array.length; i++) 
   {
    ans= ans^array[i] ;
   }   
    System.out.println(ans);
 }
}
