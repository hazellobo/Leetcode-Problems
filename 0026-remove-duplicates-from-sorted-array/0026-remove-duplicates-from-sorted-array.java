class Solution {
    public int removeDuplicates(int[] nums) {
        //[1,1,1,2,2,3,4,4,5]
        int j=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
               nums[j]=nums[i];
               j++;
           }
        }
        return j;
    }
}