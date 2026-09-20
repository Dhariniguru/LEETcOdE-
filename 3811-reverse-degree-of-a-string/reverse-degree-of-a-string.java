class Solution {
    public int reverseDegree(String s) {
        int tot= 0;
        for(int i = 0; i < s.length();i++)
        {
            int rev = 26 - (s.charAt(i) - 'a');
            int pos = i + 1;
            tot += rev * pos;
        }
        return tot;
    }
}