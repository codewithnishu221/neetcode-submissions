class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
    Arrays.fill(arr, 0);
    int l =0; int r =0; int maxLen =0; int maxFeq =0;
    int n = s.length();
    while(r < n){
        arr[s.charAt(r) -'A']++;
        maxFeq = Math.max(maxFeq, arr[s.charAt(r)- 'A']);
        if((r-l +1) - maxFeq > k){
         arr[s.charAt(l)- 'A']--;
         //maxFeq = 0;
         l++;
        }
        if( (r-l +1)  - maxFeq <= k){
            maxLen = Math.max(maxLen, (r-l +1) );
            r++;
        }
    }
        return maxLen;
    }
}
