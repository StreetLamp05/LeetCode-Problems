class Solution {
    public boolean isPalindrome(int x) {
        String forwardNumber = String.valueOf(x);
        String reverseNumber = "";
        if (x < 0)
            return false;
        else
            for (int i = forwardNumber.length() - 1; i >= 0; i--)
            {
                reverseNumber = reverseNumber + forwardNumber.charAt(i);
            }
        return forwardNumber.equals(reverseNumber);
    }
}