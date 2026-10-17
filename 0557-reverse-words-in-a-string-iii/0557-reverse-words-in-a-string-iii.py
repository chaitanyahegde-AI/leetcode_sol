class Solution:
    def reverseWords(self, s: str) -> str:
        s = list(s)
        i = 0 
        j = 0
        n = len(s)
        left = 0
        right = 0
        while j < n:
            if s[j] != ' ':
                j += 1
            else:
                left = i
                right = j - 1
                while(left < right ):
                    s[left],s[right] = s[right],s[left]
                    left += 1
                    right -=1 
                i = j+1
                j +=1
        
        left = i
        right = n-1
        while(left < right ):

            s[left],s[right] = s[right],s[left]
            left += 1
            right -=1 
        return ''.join(s)

