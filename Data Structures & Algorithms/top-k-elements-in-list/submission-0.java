class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int[] ans = new int[k];
        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
        }
        Queue<Integer> minHeap = new PriorityQueue<>((a,b)-> freqMap.get(a)- freqMap.get(b));
        for(int i: freqMap.keySet()){
            minHeap.add(i);
            if(minHeap.size()> k){
              minHeap.poll();
            }
        }
        while(k-- >0){
          ans[k] = minHeap.poll();
        }
        return ans;
    }
}
