class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int num : nums){
            long count1 = Arrays.stream(nums).filter(x->x==num).count();
            if(count1>1){
                return true;
            }
        }
        return false;
    }
}