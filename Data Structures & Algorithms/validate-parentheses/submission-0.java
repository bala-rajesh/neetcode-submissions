class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> ctp = new java.util.HashMap<>();
        ctp.put(')','(');
        ctp.put(']','[');
        ctp.put('}','{');
        for(char c : s.toCharArray()){
            if(ctp.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==ctp.get(c)){
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

        
    }
}
