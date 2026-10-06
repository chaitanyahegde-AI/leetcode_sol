class Solution:
    


    def minAddToMakeValid(self, s: str) -> int:
        open_c = 0 
        count = 0 


        for i in s:
            if i == '(' :
                open_c+=1
            else:
                if open_c>0:
                    open_c -=1

                
                else:
                    count+=1
        return count + open_c

        
        
        