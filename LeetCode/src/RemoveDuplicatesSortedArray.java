public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        //Beats 100%
        //In places algorithm that changes the values of nums array by removing duplicates and returns the number of unique elements from array.
        //O(n)
        int currentNum = nums[0];
        int count = 1;
        int indexPtr = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (!(nums[i] == currentNum))
            {
                count++;
                currentNum = nums[i];
                nums[indexPtr] = currentNum;
                indexPtr++;
            }
        }
        
        return count;
    }

    public static void main(String args[])
    {
        int[] nums = {1,1,2,3,4,4,5,5,5};
        System.out.println("Amount of items: " + nums.length);
        System.out.println("Amount of UNIQUE items: " + removeDuplicates(nums));
    }
}
