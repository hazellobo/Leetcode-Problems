class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;

        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(!set.contains(num-1)){
                int length = 0;
                while(set.contains(num + length)){
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
    
    // public int longestConsecutive(int[] nums) {
    //     int max = 0;

    //     Set<Integer> set = new HashSet<Integer>();
    //     for(int i = 0; i < nums.length; i++){
    //         set.add(nums[i]);
    //     }

    //     for(int i = 0; i < nums.length; i++){
    //         int longestConsecutiveCount = 1;

    //         //check consecutive nums in left
    //         int num = nums[i];
    //         while(set.contains(--num)){
    //             longestConsecutiveCount++;
    //             set.remove(num);
    //         }

    //         //check consecutive nums in right
    //         num = nums[i];
    //         while(set.contains(++num)){
    //             longestConsecutiveCount++;
    //             set.remove(num);
    //         }

    //         max = Math.max(max, longestConsecutiveCount);
    //     }
    //     return max;
    // }
}