class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        while (i < nums.length) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            else{
                map.put(nums[i], i);
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
