class Solution {

    public String encode(List<String> strs) {
         StringBuilder str = new StringBuilder();
         for(String i: strs){
            str.append(i.length()).append('#').append(i);
         }
         return str.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i =0; 
        int n = str.length();
        while(i<n){
            int slash = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, slash));
            int wordStart = slash + 1;
            int wordEnd = wordStart + length;
            strs.add(str.substring(wordStart, wordEnd));
            i = wordEnd;
        }
        return strs;
    }
}
