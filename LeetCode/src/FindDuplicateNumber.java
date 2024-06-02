public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int FastPtr = 0;
        int SlowPtr = 0;
        do
        {
            FastPtr = go(go(FastPtr, nums), nums);
            SlowPtr = go(SlowPtr, nums);

        }
        while (nums[FastPtr] != nums[SlowPtr]); //untill nums[FastPtr] == nums[SlowPtr] and isSame is false.
        
        FastPtr = 0;
        while (nums[FastPtr] != nums[SlowPtr])
        {
            FastPtr = go(FastPtr, nums);
            SlowPtr = go(SlowPtr, nums);
        }

        return nums[FastPtr];
    }

    public static int go(int ptr, int[] nums)
    {
        return nums[ptr];
    }

    public static void main(String args[])
    {
        int[] nums = {18,13,14,17,9,19,7,17,4,6,17,5,11,10,2,15,8,12,16,17};
        System.out.println(findDuplicate(nums));
    }
}
