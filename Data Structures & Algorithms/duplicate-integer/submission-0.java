class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i: nums){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }
        for(Integer has: hashMap.keySet()){
            if(hashMap.get(has)>1){
                return true;
            }
        }
        return false;
    }
}