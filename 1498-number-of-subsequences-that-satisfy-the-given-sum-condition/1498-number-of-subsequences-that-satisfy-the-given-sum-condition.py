class Solution:
    def numSubseq(self, nums: list[int], target: int) -> int:
        nums.sort()
        l = 0
        r = len(nums) - 1
        k = [0]*len(nums)
        k[0]=1
        ans = 0
        
        
        while(l <= r):
            if(nums[l]+nums[r] <= target):
                ans=(ans+pow(2,r-l))%1000000007
                l+=1
            else:
                r-=1
        return ans



