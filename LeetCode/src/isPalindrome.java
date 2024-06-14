public class isPalindrome {
    //O(n) time complexity
    public boolean isPalindromeFunction(int x) {
        String string = Integer.toString(x);
        int length = string.length();
        for (int i = 0; i < length / 2; i++)
        {
            if (string.charAt(i) != string.charAt(length - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
}
