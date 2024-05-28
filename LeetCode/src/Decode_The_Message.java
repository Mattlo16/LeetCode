import java.util.HashMap;

public class Decode_The_Message {
    public static String decodeMessage(String key, String message) {
        HashMap <Character, Character> letters = new HashMap<>();
        char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        int alphabetIndex = 0;
        key = key.replaceAll(" ", "");
        for (int i = 0; i < key.length(); i++)
        {
            Character letter = letters.putIfAbsent(key.charAt(i), alphabetArray[alphabetIndex]);

            if (letter == null)
            {
                alphabetIndex++;
            }
        }
        String secretMessage = "";
        for (int j = 0; j < message.length(); j++)
        {   
            if (message.charAt(j) == ' ')
            {
                secretMessage = secretMessage + ' ';
            }
            else
            {
                secretMessage = secretMessage + letters.get(message.charAt(j));
            }
            
        }
        return secretMessage;
    }

    public static void main (String args[])
    {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
