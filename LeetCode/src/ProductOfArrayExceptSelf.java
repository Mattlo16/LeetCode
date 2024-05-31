public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        //O(n) time efficiency, beats 90% of users
        int[] products = new int[nums.length];
        int product = 1;
        boolean hasZero = false;
        int Zeros = 0;
        for (int i = 0; i < nums.length; i++) //iterates through nums array to get the product of all the numbers.
        {
            if (nums[i] != 0)
            {
                product = product * nums[i];
            }
            else
            {
                hasZero = true;
                Zeros++;
            }
        }
        if (Zeros > 1) //If there are more than 1 0s in nums, every number will be 0s.
        {
            int[] zeros = new int[nums.length];
            for (int y = 0; y < nums.length; y++)
            {
                zeros[y] = 0;
            }
            return zeros;
        }
        if (hasZero) //If there is atleast 1 zero, everything besides nums[i] == 0 will be 0. nums[i] will be the product.
        {
            for (int x = 0; x < nums.length; x++)
            {
                if (nums[x] == 0)
                {
                    products[x] = product;
                }
                else
                {
                    products[x] = 0;
                }
            }
            return products;
        }

        for (int j = 0; j < nums.length; j++) //Iterates through nums and populates products[] with the right values.
        {
            if (nums[j] == 0)
            {
                products[j] = product;
            }
            else
            {
                products[j] = product / nums[j];
            }
            
        }
        return products;
    }

    public static void main(String args[]) //Used to test the function.
    {
        int[] array = {-1, 1, 0, -3, 3};
        printArray(array);
        int[] newArray = productExceptSelf(array);
        System.out.println();
        printArray(newArray);
    }

    public static void printArray(int[] array) //Function I made to make testing easier.
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
