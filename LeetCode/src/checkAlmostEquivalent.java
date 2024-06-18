import java.util.HashMap;

public class checkAlmostEquivalent {
    public boolean checkAlmostEquivalentFunction(String word1, String word2) {
        HashMap<Character, Integer> word1Map = new HashMap<>(); 
        HashMap<Character, Integer> word2Map = new HashMap<>();
        for (int i = 0; i < word1.length(); i++)
        {
            if (!word1Map.containsKey(word1.charAt(i)))
            {
                word1Map.put(word1.charAt(i), 1);
            }
            else
            {
                word1Map.put(word1.charAt(i), word1Map.get(word1.charAt(i)) + 1);
            }
        }

        for (int j = 0; j < word2.length(); j++)
        {
            if (!word2Map.containsKey(word2.charAt(j)))
            {
                word2Map.put(word2.charAt(j), 1);
            }
            else
            {
                word2Map.put(word2.charAt(j), word2Map.get(word2.charAt(j)) + 1);
            }
        }

        for (char c : word1Map.keySet())
        {
            if (!word2Map.containsKey(c))
            {
                if (word1Map.get(c) > 3)
                {
                    return false;
                }
            }
            else
            {
                if (word2Map.get(c) - word1Map.get(c) > 3)
                {
                    return false;
                }
            }
        }

        for (char c : word2Map.keySet())
        {
            if (!word1Map.containsKey(c))
            {
                if (word2Map.get(c) > 3)
                {
                    return false;
                }
            }
            else
            {
                if (word1Map.get(c) - word2Map.get(c) > 3)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
