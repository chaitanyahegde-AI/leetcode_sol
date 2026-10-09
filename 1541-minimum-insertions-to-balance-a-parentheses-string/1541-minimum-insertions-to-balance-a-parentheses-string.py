class Solution:
    def minInsertions(self, s: str) -> int:
        openp = 0 
        i = 0 
        inser=0
        while(i<len(s)):
            if s[i] == '(':
                openp+=1
                i+=1
            else:
                if(openp>0):
                    openp-=1
                else:
                    inser+=1
                if (i+1<len(s) and s[i+1]==')'):
                    i+=2
                else:
                    inser+=1
                    i+=1
        inser+=2*openp
        return inser