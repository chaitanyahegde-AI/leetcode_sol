class Solution {
    public String reverseVowels(String s) {
        int i = 0 ;

        int j = s.length() - 1;
        char[] a =  s.toCharArray();
        Set<Character> v = Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        );
        char temp ;


        while(i < j){
                if(v.contains(a[i]) && v.contains(a[j])){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp ;
                        i++;
                        j--;

                }
                else if(!v.contains(a[i])){
                    i++;
                }
                else if(!v.contains(a[j])){
                    j--;

                }
        }
        return new String(a);

    }
}