class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        Arrays.fill(map, 0);
        for(char c: t.toCharArray()){
           map[c]++;
        }
        int l =0; int r =0; int minLen=Integer.MAX_VALUE; 
        int count =0; int startIdx = -1;
        while(r < s.length()){
            if(map[s.charAt(r)]> 0){
                count++;
            }
            map[s.charAt(r)]--;
            while(count == t.length()){
                if(r-l +1 < minLen){
                    minLen = r -l +1;
                    startIdx =l;
                }

                map[s.charAt(l)]++;
                if(map[s.charAt(l)] > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
    }
}
