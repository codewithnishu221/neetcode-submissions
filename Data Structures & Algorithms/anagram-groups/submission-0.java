class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();
        for(String s: strs){
            int[] freq = new int[26];
            for(char ch: s.toCharArray()){
                freq[ch - 'a']++;
            }
            String key = Arrays.toString(freq);
            if(!myMap.containsKey(key)){
                myMap.put(key, new ArrayList<>());
            }
            myMap.get(key).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
}
