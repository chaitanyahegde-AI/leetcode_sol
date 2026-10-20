class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int[] k = new int[nums.length];
        k[0]=1;
        int ans = 0;
        for(int i = 1;i<nums.length;i++){
            k[i]=(k[i-1]*2)%1000000007;

        }

        while(left <= right){
            if(nums[left] + nums[right]<=target){
                ans=(ans+k[right - left])%1000000007;
                left++;

            }
            else right--;

        }
        return ans;
        
    }
}