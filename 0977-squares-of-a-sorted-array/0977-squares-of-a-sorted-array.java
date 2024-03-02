class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        
        int start=0;
        int end =nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
             int startNum=nums[start];
             int endNum=nums[end];
            if(Math.abs(startNum) > Math.abs(endNum)){
                result[i]=startNum*startNum;
                start++;
            }else{
                result[i]=endNum*endNum;
                end--;
            }
        }
        return result;
    }
    
     public int[] sortedSquaresNaive(int[] nums) {
        int[] result=new int[nums.length];
        
        for(int i=0; i< nums.length;i++){
            int value=nums[i];
            result[i]=value*value;
        }
        Arrays.sort(result);
        return result;
    }
}