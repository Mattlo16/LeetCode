public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] targets = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target && i != j)
                {
                    targets[0] = i;
                    targets[1] = j;
                }
            }
        }
        return targets;
    }

    public static void main(String args[])
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] solution = twoSum(nums, target);
        System.out.print("Indexes of array that add up to target: [" + solution[1] + ", " + solution[0] + "]");
    }
}
