class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for(String word :strs){
            char[] chararray = word.toCharArray();
            Arrays.sort(chararray);
            String sortedword = new String(chararray);
            map.putIfAbsent(sortedword, new ArrayList<>());
            map.get(sortedword).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}
