class Solution {
    public int digitFrequencyScore(int n) {
        int sol = 0;
        while(n > 0)
        {
            sol += n%10;
            n = n/10;
        }
        return sol;
    }
}