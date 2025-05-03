class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Edge case: if the input array is empty, return an empty list
        if (strs.length == 0) {
            return new ArrayList();
        }
        // Map to store grouped anagrams using a character frequency key
        Map<String, List> ansMap = new HashMap<>();
        // Array to count frequency of each character (a-z)
        int[] count = new int[26];
        // Loop through each word in the input array
        for (String s : strs) {
            Arrays.fill(count, 0); //count=[0,0,0,0,0,0,0,0,0,......]
            // Count each character's frequency in the word
            for (char c : s.toCharArray()) {

                count[c - 'a']++;//count=[0,0,1,0,0,0,,0,0,0.....]
            }
            // Build a unique key based on character counts
            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < 26; i++) {
                sb.append("#");// add a delimiter to separate counts
                sb.append(count[i]);// append count of each character
            }

            String key = sb.toString();// example key: "#1#0#0#0#1..."
            // If the key doesn't exist in map, create a new list for this group

            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList());
            }
            // Add the current word to its anagram group

            ansMap.get(key).add(s);

        }
        // Return the values (lists of anagrams) as a single list

        return new ArrayList(ansMap.values());

    }
}