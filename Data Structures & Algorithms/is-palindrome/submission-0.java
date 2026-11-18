
class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        
        boolean result = true;
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int p2 = s.length()-1;
        while(p1<p2){
            if(s.charAt(p1)==s.charAt(p2)){
                p1++;
                p2--;
            } else {
                result = false;
                break;
            }
        }
        return result;
        
    }
}
