class Solution {
    public boolean isAnagram(String s, String t) {
        long count1;
        long count2;
       
        if(s.length()!=t.length()){
           return false;
        }
        for(char letter : t.toCharArray()){
            if(s.indexOf(letter)==-1){
                return false;
            }
           count1 = s.chars().filter(x->x==letter).count();
           count2 = t.chars().filter(x->x==letter).count();
           if(count1!=count2){
            return false;
           }
            
        }

        return true;

    }
}
