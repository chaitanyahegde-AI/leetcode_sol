class Solution:
    def charv(self,c):
        match c:
            case ')':
                return '('
                 
            case '}':
                return '{'
                
            case ']':
                return '['
                
        return '0'


    def isValid(self, s: str) -> bool:
        stack = []


        for i in s:
            if i == '(' or i == '{' or i == '[':
                stack.append(i)
            else:

                if not stack or stack[-1] != self.charv(i):
                    return False
                else:
                    stack.pop()
        return not stack

        
        