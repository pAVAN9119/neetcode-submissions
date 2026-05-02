class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i])+1);
        }
        
        int[] arr = new int[k];
        int j = 0;

        
        while(j < k){
            int maxValue = Collections.max(map.values());
            Set<Integer> keys = map.keySet();
            for(int key : keys){
                if(map.get(key) == maxValue){
                    arr[j] = key;
                    map.put(key,0);
                    break;
                }
            }
            j++;
        }
        
        return arr;

    }
}
