class Solution {
    public int minPairSum(int[] nums) {
        int i = 0 ;
        int j = nums.length - 1 ;
        int res = 0 ;
        int sum = 0 ;
        Arrays.sort(nums);
        while(i < j){
            sum = nums[i] + nums[j];
            res = Math.max(res,sum);
            i++;
            j--;

        }
        return res ;
    }
}