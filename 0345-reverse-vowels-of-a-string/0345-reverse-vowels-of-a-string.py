class Solution:
    def reverseVowels(self, s: str) -> str:
        i = 0
        j = len(s)-1
        temp =""
        s = list(s)
        v = "aeiouAEIOU"
        
        while(i<j):
            if (s[i] in v  and s[j] in v ):
                temp = s[i]
                s[i] = s[j]
                s[j] = temp
                i+=1
                j-=1
            elif s[i] not in v:
                i+=1
            elif s[j] not in v :
                j-=1
            
        return "".join(s) 



        
       
