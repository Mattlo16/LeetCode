public class ScoreOfAString {
    //Beats 100%
    public int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        int sum = 0;
        for (int i = 1; i < charArray.length; i++)
        {
            int Char1 = charArray[i];
            int Char2 = charArray[i - 1];
            sum += Math.abs(Char1 - Char2);
        }
        return sum;
    }
}
