class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] output = new int[nums.length];

        prefix[0] = 1;
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            output[i] = prefix[i] * suffix[i];
        }

        return output;
        




























        // int product = 1;
        // int nonZeroProduct = 1;
        // int countZero = 0;
        // for(int num : nums){
        //     product *= num;
        //     if(num != 0){
        //         nonZeroProduct *= num;
        //     }
        //     if(num == 0) countZero++;
        // }
        // int[] res = new int[nums.length];
        // for(int i=0; i<res.length; i++){
        //     if(countZero == 1){
        //         if(nums[i] == 0){
        //             res[i] = nonZeroProduct;
        //         }
        //         else{
        //             res[i] = 0;
        //         }
        //     }
        //     else{
        //         res[i] = product/nums[i];
        //     }
            
        // }
        // return res;
    }
}  
