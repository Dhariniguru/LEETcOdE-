class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int n:nums)
        {
            if(n < min) min = n;
            if(n > max) max = n;
        }

        int a = max;
        int b = min;

        while(b != 0)
        {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a ;
    }
}