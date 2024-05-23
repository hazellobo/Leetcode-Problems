class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i : nums){
            if(s.contains(i))
                return true;
            s.add(i);
        }
        return false;
    }
}