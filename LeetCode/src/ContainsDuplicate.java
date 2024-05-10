import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i-1])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int nums[] = {1,2,3,4,1};
        if (containsDuplicate(nums))
        {
            System.out.println("The array DOES in fact have a duplicate!!!");
        }
        else
        {
            System.out.println("The array DOES NOT have a duplicate.");
        }
    }
}
