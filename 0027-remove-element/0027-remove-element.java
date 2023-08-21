class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        //[0, 1, 2, 2, 5, 2, 4,3]       2
        //overriding the values when it is not equal to val
        for(int i=0; i< nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}