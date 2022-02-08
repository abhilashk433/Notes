class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        
        int[] numOfSteps= new int[n+1];
        
        numOfSteps[1]=1;
        numOfSteps[2]=2;
        
      // the number of steps at n'th stair is the total of steps for the previous 2 stairs
        for (int i=3;i<=n;i++){
            numOfSteps[i]=numOfSteps[i-1]+numOfSteps[i-2];
        }
        
        return numOfSteps[n];
    }
}
