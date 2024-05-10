import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String args[])
    {
        String s = "anagram";
        String t = "nagaram";
        if (isAnagram(s, t))
        {
            System.out.println("Valid Anagram :D");
        }
        else
        {
            System.out.println("Not an Anagram :(");
        }
    }
}
