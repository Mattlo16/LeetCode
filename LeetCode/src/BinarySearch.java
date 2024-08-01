import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int array[], int target)
    {
        if (target >= array.length)
        {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right)
        {
            int mid = (left + right)/2;
            if (array[mid] == target)
            {
                return mid;
            }
            else if (target < array[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int list[] = {7, 15, 3, 12, 20, 1, 18, 5, 9, 14, 8, 2, 17, 13, 4, 19, 10, 11, 6, 16};
        System.out.print("Array before sorting: ");
        printList(list);
        System.out.println();
        Arrays.sort(list);
        System.out.print("Array after sorting: ");
        printList(list);
        System.out.println();
        System.out.println(binarySearch(list, 16));
        
    }

    public static void printList(int list[])
    {
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
}
