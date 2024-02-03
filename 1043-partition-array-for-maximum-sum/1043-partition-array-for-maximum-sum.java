class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int length=arr.length;
        int[] dp=new int[k];
        
        for(int i=1;i<=length;i++){
            int currMax=0;
            int best=0;
            for(int j=1;j <=k && i-j >=0;j++){
                currMax=Math.max(currMax, arr[i-j]);
                best=Math.max(best, dp[(i-j)% k] + currMax*j);
            }
            dp[i%k]=best;
        }
        return dp[length % k];
    }
}