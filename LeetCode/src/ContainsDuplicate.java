import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
    /* Previous code, can be optimized.
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
*/
    //Better code.
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i], i);
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
