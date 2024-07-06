public class MissingNumber {
    public int missingNumber(int[] nums) {
        //Beats 100%
        int total = 0;
        for (int i = 0; i < nums.length; i++)
        {
            total += i - nums[i];
        }
        return total + nums.length;
    }
}
