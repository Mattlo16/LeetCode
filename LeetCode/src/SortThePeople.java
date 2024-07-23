import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        //O(nlongn), Tilde: 2nlogn
        //Beats 91%
        int arrayLength = names.length;
        HashMap<Integer, String> hashtable = new HashMap<>();
        for(int i = 0; i < arrayLength; i++)
        {
            hashtable.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int x = 0;
        String array[] = new String[arrayLength];
        for (int j = arrayLength - 1; j >= 0; j--)
        {
            array[x] = hashtable.get(heights[j]);
            x++;
        }
        return array;
    }

    public static void main(String args[])
    {
        String[] names = {"Mary","John","Emma"};
        int[] sizes = {180,165,170};
        printArray(sortPeople(names, sizes));
    }

    public static void printArray(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
