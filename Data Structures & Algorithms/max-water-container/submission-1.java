class Solution {
    public int maxArea(int[] heights) {
        int j = heights.length-1;
        int i = 0;
        int max = 0;
           while(i < j){
            int w = j - i;
            int h = Math.min(heights[i], heights[j]);
            int area = w * h;
            max = Math.max(max, area);
            if(heights[i] > heights[j]){
            j--;
           } else{
            i++;
           }
        }
        return max;
    }
}
