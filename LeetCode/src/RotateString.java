public class RotateString {
    /* 
    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal))
        {
            return true;
        }
        String CopyOfs = s;
        s = shift(s);
        while (!s.equals(CopyOfs))
        {
            if (s.equals(goal))
            {
                return true;
            }
            s = shift(s);
        }
        return false;
    }

    public static String shift(String s)
    {
        char firstChar = s.charAt(0);
        s = s.substring(1);
        s += firstChar;
        return s;
    }
*/
    //Highly efficient, beats 100%
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
        {
            return false;
        }
        String concatenation = s + s;
        return concatenation.contains(goal);
    }   

    public static void main(String args[])
    {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}
