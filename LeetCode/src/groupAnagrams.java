import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    //ineficient solution O(n^2):
    /*
     * ArrayList<String> strsArrayList = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> AllAnagrams = new ArrayList<>();
        for (int i = 0; i < strsArrayList.size(); i++)
        {
            char[] charArray = strsArrayList.get(i).toCharArray();
            Arrays.sort(charArray);
            List<String> SingleAnagram = new ArrayList<>();
            for (int j = 0; j < strsArrayList.size(); j++)
            {
                char[] charArray2 = strsArrayList.get(j).toCharArray();
                Arrays.sort(charArray2);
                if (Arrays.equals(charArray, charArray2))
                {
                    SingleAnagram.add(strsArrayList.get(j));
                }
            }
            if (!AllAnagrams.contains(SingleAnagram))
            {
                AllAnagrams.add(SingleAnagram);
            }
            
        }
        return AllAnagrams;
     */

    //Time eficient solution:
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs)
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            map.putIfAbsent(sortedWord, new ArrayList<>());

            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String args[])
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.print("Here are the strings: ");
        for (String word : strs)
        {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("Now here are the anagrams: " + groupAnagrams(strs));
    }
}
