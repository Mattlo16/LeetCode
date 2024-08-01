public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) 
    {
        for (int i = 0; i < matrix.length; i++)
        {
            int peek = binarySearch(matrix[i], target);
            if (peek != -1)
            {
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int nums[], int target)
    {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right)
        {
            int mid = (left + right)/2;
            if (target == nums[mid])
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        System.out.println(":3");
        int[][] array = {{1}};
        System.out.println(searchMatrix(array, 1));
    }
    
}
