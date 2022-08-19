public class Array_leetcodeShuffle 
{
    public static void main(String[] args) 
    {
       int[] arr =  {1,2,3,4,5,6};
       Shuffle(arr, 4) ;      
    }
    public int[] Shuffle(int[] nums, int n)
    {
        int[] result = new int[n * 2];

        for (int i = 0; i < n; i++)
        {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }

        return result;
  
    
}
}
