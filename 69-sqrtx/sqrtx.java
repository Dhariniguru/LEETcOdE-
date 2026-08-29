class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Use long to prevent integer overflow when computing mid * mid
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;        // mid is a valid floor candidate
                left = mid + 1;  // search upper half
            } else {
                right = mid - 1; // search lower half
            }
        }

        return ans;
    }
}