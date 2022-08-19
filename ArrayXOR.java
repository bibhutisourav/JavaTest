
public class ArrayXOR 
{
   static void printArr(int arr[],int n)
        {
            for (int i = 0; i < arr.length; i++) 
            {
            System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        
       static void setToZero(int arr[],int n)
        {
            Arrays.fill(arr, 0);
        }
        
       static void xor1ToN(int arr[], int n)
        {
            for (int element = 0; element < arr.length; element++) 
           {
                  arr[element]^=element ;
           }
           //Xor arr[i]^i
        }
    }
    

