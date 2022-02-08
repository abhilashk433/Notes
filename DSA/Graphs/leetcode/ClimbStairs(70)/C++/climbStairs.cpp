class Solution {
public:
    int climbStairs(int n) {
        int dp[n+1];
        memset(dp,-1,sizeof(dp));
        return solve(n,dp);
    }
    int solve(int n, int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }else{
            dp[n] = solve(n-1,dp)+ solve(n-2,dp);
        }    
        return dp[n];
    }
};
