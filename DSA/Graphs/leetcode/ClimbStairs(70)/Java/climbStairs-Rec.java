//Recursive solution below
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

// DP solution below
class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    static int solve(int n, int dp[]){      
        if(n == 0)
            return 1;
        if(n<0)
            return 0;
        
        if(dp[n]!= -1){
            return dp[n];
        }else{
            int ans1 = solve(n-1,dp);
            int ans2 = solve(n-2,dp);
            dp[n]=ans1+ans2;
        }
        
        return dp[n];
    }
}
