class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // Skips duplicate for first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0)
                    r -= 1;
                else if(sum < 0)
                    l += 1;
                else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l += 1;
                    while(nums[l] == nums[l-1] && l < r)
                        l += 1;
                }
            }
        }
        return res;
    }
}