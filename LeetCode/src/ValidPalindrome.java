public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String palindrome = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < palindrome.length()/2; i++)
        {
            char ptr1 = palindrome.charAt(i); //First character in string
            char ptr2 = palindrome.charAt(palindrome.length() - i - 1); //Last character in string

            if (ptr1 != ptr2)
            {
                return false;
            }

        }
        return true;
    }
}
