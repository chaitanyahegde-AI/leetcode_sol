class Solution:
    def maxScoreSightseeingPair(self, values: list[int]) -> int:
        ans = 0
        maxl = values[0]+0
        for i in range(1,len(values)):
            
            ans = max(ans,maxl+values[i]-i)
            maxl = max(maxl,values[i]+i)
        return ans 