class Solution {
    public String reverseVowels(String s) {
        int i = 0 ;

        int j = s.length() - 1;
        char[] a =  s.toCharArray();
        String v = "aeiouAEIOU";
        char temp ;


        while(i < j){
                if(v.indexOf(a[i])!=-1 && v.indexOf(a[j])!=-1){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp ;
                        i++;
                        j--;

                }
                else if(v.indexOf(a[i])==-1){
                    i++;
                }
                else if(v.indexOf(a[j])==-1){
                    j--;

                }
        }
        return new String(a);

    }
}