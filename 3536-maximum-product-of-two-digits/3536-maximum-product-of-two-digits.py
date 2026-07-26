class Solution:
    def maxProduct(self, n: int) -> int:
        s="".join(sorted(str(n),reverse=True))
        res = int(s[1])*int(s[0])
        return res 