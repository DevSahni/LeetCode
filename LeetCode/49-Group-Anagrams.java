class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Count the frequency of each character
            int[] charCount = new int[26]; // Assuming lowercase English letters
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Build the key from the frequency count
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append(count).append(\#\); // Add a delimiter to separate counts
            }
            String key = keyBuilder.toString();

            // Group the strings with the same key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        // Collect all groups from the map
        return new ArrayList<>(map.values());
    }
}