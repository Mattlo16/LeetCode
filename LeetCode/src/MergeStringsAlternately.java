public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String newWord = "";
        int word1Length = word1.length();
        int word2Length = word2.length();
        
        if (word1Length > word2Length) //Word 1 is greater than word 2
        {
            int counter = 0;
            int word1Index = 0;
            int word2Index = 0;
            while (word2Index < word2Length)
            {
                if (counter % 2 == 0)
                {
                    newWord += word1.charAt(word1Index);
                    word1Index++;
                }
                else
                {
                    newWord += word2.charAt(word2Index);
                    word2Index++;
                }
                counter++;
            }
            newWord += word1.substring(word2Length, word1Length);
        } 
        else if (word2Length > word1Length)
        {
            int counter = 0;
            int word1Index = 0;
            int word2Index = 0;
            while (word1Index < word1Length)
            {
                if (counter % 2 == 0)
                {
                    newWord += word1.charAt(word1Index);
                    word1Index++;
                }
                else{
                    newWord += word2.charAt(word2Index);
                    word2Index++;
                }
                counter++;
            }
            newWord += word2.substring(word1Length - 1, word2Length);
        }
        else //word1Length == word2Length
        {
            int word1Index = 0;
            int word2Index = 0;
            for (int i = 0; i < word1Length + word2Length; i++)
            {
                if (i % 2 == 0)
                {
                    newWord += word1.charAt(word1Index);
                    word1Index++;
                }
                else
                {
                    newWord += word2.charAt(word2Index);
                    word2Index++;
                }
            }
        }
        return newWord;
    }


    public static void main(String args[])
    {
        String word1 = "popopo";
        String word2 = "opopop";
        System.out.println(mergeAlternately(word1, word2));
    }
}
