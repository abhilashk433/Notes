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
