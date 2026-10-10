class Solution:
    def isGood(self, nums: List[int]) -> bool:
        n = max(nums)
        k= len(nums)
        if n != len(nums)-1:
            return False 
        nums.sort()

        for i in range(k-1):
            if nums[i]!=i+1:
                return False 
        return nums[k-1] == nums[k-2]

        
