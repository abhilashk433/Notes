//Recursive Solution
class Solution {
    public int change(int amount, int[] coins) {
         return cc(amount,coins,0);
    }
    static int cc(int amount,int[] coins,int i){
        if(amount == 0){
            return 1;
        }
        if(amount <0 || i==coins.length){
            return 0;
        }
        
        int ans1=cc(amount-coins[i],coins,i);
        int ans2=cc(amount,coins,i+1);
        return ans1+ans2; 
        
    }
}

//DP
class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[amount+1][coins.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return cc(amount,coins,0,dp);
    }
    static int cc(int amount,int[] coins,int i, int dp[][]){
        if(amount == 0){
            return 1;
        }
        if(amount <0 || i==coins.length){
            return 0;
        }
        
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }else{
            int ans1=cc(amount-coins[i],coins,i,dp);
            int ans2=cc(amount,coins,i+1,dp);    
            dp[amount][i]=ans1+ans2;        
        }
        
        return dp[amount][i];
        
    }
}
