class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int ans[] = new int[n];

        int prod=1;
        for(int i=0; i<n;i++){
            ans[i]=prod;
            prod*=nums[i];
        }

        prod=1;
        for(int j=n-1; j>=0;j--){
            ans[j] *= prod;
            prod *=nums[j];
        }
        return ans;
    }
}