import java.util.Arrays;

public class ArrayReversing 
{
  public static void main(String[] args) 
  {
    int[] arr = {1,2,3,4,5,6,7,8,9} ;

    // swap(arr, 5, 1) ;
    // reversing(arr);
    another_way(arr);
    
    System.out.println(Arrays.toString(arr));
  }    

  static void swap(int[] arr, int index1, int index2)
  {
     arr[index1]^=arr[index2];
     arr[index2]^=arr[index1];
     arr[index1]^=arr[index2];

    // int temp =  arr[index1];
    // arr[index1] = arr[index2] ;   
    // arr[index2] = temp ;  
  }
  
  static void reversing(int[] arr)
  {
    int start = 0 ;
    int end = arr.length-1 ;

    while (start < end) 
    {
       swap(arr, start, end);
       start++ ;
       end-- ;    
    }
  }

  static void another_way(int[] swapp) 
  {
    int end = swapp.length;
    
    for (int i = 0; i < swapp.length/2; i++) 
    {
      // temp = swapp[i] ;
      // swapp[i] = swapp[end-i-1] ;   
      // swapp[end-i-1] = temp    ;
    
      swapp[i]^=swapp[end-i-1];
      swapp[end-i-1]^=swapp[i];   
      swapp[i]^=swapp[end-i-1];
    }
    
    // for (int element : swapp) 
    // {
    //     System.out.print(element + " ");
    //     // System.out.print(element + " ");        
    // }

    static void interchange(int a[][],int r, int c){
        
      for(int i=0; i<r; i++)
      {
         // a[i][0]=a[i][0]^a[i][c-1];
         // a[i][c-1]=a[i][0]^a[i][c-1];
         // a[i][0]=a[i][0]^a[i][c-1];
         int temp = a[i][0];
         a[i][0] = a[i][c-1];
         a[i][c-1] = temp;
      }      
 
     
     for(int i = 0;i<r;i++){
         for(int j = 0;j<c;j++){
             System.out.print(a[i][j] + " ");
         }
         System.out.println();
     } 
 }

}




  }
  
}


