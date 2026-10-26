class Solution {
    public boolean isAnagram(String s, String t) {
    Map<Character, Integer> charMap = new HashMap<>();
    if(s.length() != t.length()){
     return false;
    }
    for(Character ch: s.toCharArray()){
        charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
    }
    for(Character ch: t.toCharArray()){
        charMap.put(ch, charMap.getOrDefault(ch, 0)-1);
    }
    for(Character ch: charMap.keySet()){
        if(charMap.get(ch)!=0){
            return false;
        }
    }
    return true;
    }
}
