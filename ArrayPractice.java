import java.util.Arrays;
import java.util.Scanner;

/**
 * ArrayConcation
 */
public class ArrayPractice 
{
// que_1
public static void main(String[] args) 
{
  float[] num = {50.0f, 80.0f, 50.0f};
  float sum = 0 ;

  for (float f : num) 
  {
    sum+=f ;
  }
  System.out.println("ques 1 sum is = " + sum);
  System.out.println("Avg sum is = " + sum/num.length);

  // #########################################################
 //  ques_2

 int[] arr = {4 ,5 ,6};
 int key = 8;
 boolean present = false ;
 for (int a : arr) 
 {
    if (a == key) 
    {
     present = true;
     break ;   
    }     
 }
 if (present) 
 {
 System.out.println("yes key = " + key);   
 } 
 else 
 {
  System.out.println("NO");   
 }

// swapping in array   ###########################??????????????
int[] swapp = {1, 2, 3, 4, 5, 6, 7, 8};
int end = swapp.length;
int temp;

for (int i = 0; i < swapp.length/2; i++) 
{
//   temp = swapp[i] ;
//   swapp[i] = swapp[end-i-1] ;   
//   swapp[end-i-1] = temp    ;

  swapp[i]^=swapp[end-i-1];
  swapp[end-i-1]^=swapp[i];   
  swapp[i]^=swapp[end-i-1];
}

for (int element : swapp) 
{
    System.out.print(element + " ");       
}
System.out.println("\n");
// max in array
int[] max = {1, 2, 3, 4, 85, 6, 7, 8, 97};
// int current = 0 ;
int current = max[0];
for (int a : max) 
{
   
  if (a > current)
  // if (arr[i] < current)
  {
     current = a ; //arr[i]
  }  
}
System.out.println("max element "+current);
// int[] myArray = {23, 92, 56, 39, 93};
//       MinAndMax m = new MinAndMax();
//       System.out.println("Maximum value in the array is::"+m.max(myArray));
//       System.out.println("Minimum value in the array is::"+m.min(myArray));



}
   

}


