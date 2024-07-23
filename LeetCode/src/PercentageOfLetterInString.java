public class PercentageOfLetterInString {
    public static int percentageLetter(String s, char letter) {
        //Beats 100%, O(n)
        int amountOfLetter = 0;
        int wordLength = s.length();
        for (int i = 0; i < wordLength; i++)
        {
            if (s.charAt(i) == letter)
            {
                amountOfLetter++;
            }
        }
        double result = ((double) amountOfLetter/wordLength) * 100;
        return (int)result;
    }
    
    public static void main(String[] args)
    {
        String s = "foobar";
        char letter = 'o';
        System.out.println("Percentage: " + percentageLetter(s, letter));
    }
}
