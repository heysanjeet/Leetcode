class Solution {
    
    //Time O(n) | space O(1)
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        if (str.isEmpty()) {
            return false;
        }

        while (start <= end) {
            char currentFirst = s.charAt(start);
            char currentLast = s.charAt(end);
            if (!Character.isLetterOrDigit(currentFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currentLast)) {
                end--;
            } else {
                if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}