class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] == arr[i + 1])
            {
                return arr[i];
            }
        }
        return -1;
    }
}