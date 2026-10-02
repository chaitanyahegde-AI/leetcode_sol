class Solution {
    public char cv(char c){
        switch(c){
            case ')':
            return '(';
            

            case '}':
            return '{';
            
            case ']':
            return '[';
        

    }
    return '0';
    }

    public boolean isValid(String s) {
        char[] stack = new char[10000000];
        int top = -1 ;


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack[++top]=s.charAt(i);


            }
            else if(top == -1 || stack[top]!=cv(s.charAt(i))){
                return false ;

            }
            else top--;

        }
        return top==-1 ;
            

    }
}