public class SingleNumber {
    public static int singleNumber(int[] nums) {
        //Really cool solution!!! Very interesting bit manipulation utilizing XOR. 
        int number = 0;
        for (int i = 0; i < nums.length; i++)
        {
            number ^= nums[i]; //XOR current element with number.
        }
        return number; //Returns the number that appeared once, every other number would eventually 
                       //cancel out because a ^ a = 0 and then lastly b ^ 0 = b. Returns b
    }

    public static void main(String args[])
    {
        int[] array = {4,1,2,1,2};
        System.out.print("Array contents: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Only number that appeared once: " + singleNumber(array));
    }
}
