class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> maplist = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            maplist.put(nums[i],maplist.getOrDefault(nums[i],0)+1);
            if(maplist.getOrDefault(nums[i],0)>1){
                return true;
            }

        }
        return false;
        
    }
}