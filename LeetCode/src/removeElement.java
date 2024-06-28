public class removeElement {
    public static int removeElementFunction(int[] nums, int val) {
        //Beats 100%
        //In place algo that changes the values in array and returns the amount of elements that are != val.
        int indexCounter = 0;
        int nonVal = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[indexCounter] = nums[i];
                indexCounter++;
                nonVal++;
            }
        }
        return nonVal;
    }

    public static void main(String args[])
    {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("Amount of elements that are not " + val + " : " + removeElementFunction(nums, val));
        printArray(nums);
    }

    public static void printArray(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i] + " ");
        }
    }
}
