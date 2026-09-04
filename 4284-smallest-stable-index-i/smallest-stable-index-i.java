class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int n = nums.length;

       for(int i = 0; i < n; i++)
       {
        int maxleft =  nums[0];
        for(int j = 0; j <= i; j++)
        {
            maxleft = Math.max(maxleft,nums[j]);
        }
        int minRight = nums[i];
        for(int j = i; j < n; j++)
        {
            minRight = Math.min(minRight,nums[j]);
        }
        if((long) maxleft - minRight <= k)
        {
            return i;
        }
       } 
       return -1;
    }
}