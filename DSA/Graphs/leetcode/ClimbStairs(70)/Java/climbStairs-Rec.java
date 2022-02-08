class Solution {
    public int climbStairs(int n) {
        if(n == 0)
            return 1;
        if(n<0)
            return 0;
        
        int ans1 = climbStairs(n-1);
        int ans2 = climbStairs(n-2);
        
        return ans1+ans2;
    }
}
