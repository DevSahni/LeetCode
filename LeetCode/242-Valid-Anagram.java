class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths differ, they can't be anagrams
        }

        // Convert strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}