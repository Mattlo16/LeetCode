public class LongestCommonPrefix {
    public static String longestCommonPrefixMethod(String[] strs) {
        if (strs.length == 1)
        {
            return strs[0];
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
        {
            String currString = strs[i];
            if (prefix.length() < currString.length())
            {
                while (prefix.length() < currString.length())
                {
                    currString = currString.substring(0, prefix.length());
                }
            }
            else if (prefix.length() > currString.length())
            {
                while (prefix.length() > currString.length())
                {
                    prefix = prefix.substring(0, currString.length());
                }
            }
            //Above is part of code that makes the strings the same length.
            //Now we will start iterating backwards on the strs[i] and compare it each time to prefix until they match.
            //If they never match just return empty string "".
            while (!currString.equals(prefix))
            {
                currString = currString.substring(0, currString.length() - 1);
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.equals(""))
            {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args)
    {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefixMethod(strs)); //returns "fl".
    }
}
