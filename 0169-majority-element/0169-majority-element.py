class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # using hashMap but the space complexity affected 
        freq={}
        for num in nums:
            if num not in freq:
                freq[num]=1
            else:
                freq[num]+=1
            if freq[num]>len(nums)/2:
                return num
