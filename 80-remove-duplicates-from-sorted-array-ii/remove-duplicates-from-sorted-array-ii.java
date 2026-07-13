class Solution {
    public int removeDuplicates(int[] nums) {
        int x = nums.length;
        if(x <= 2)
        {
            return x;
        }
        int j = 2;
        for(int i = 2; i < x; i++)
        {
            if(nums[i] != nums[j - 2])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}