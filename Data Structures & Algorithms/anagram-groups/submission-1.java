class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> worldMap = new HashMap<>();
        for(String word : strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if(!worldMap.containsKey(sortedWord)){
                worldMap.put(sortedWord,new ArrayList<>());
            }
            worldMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(worldMap.values());
        
    }
}
