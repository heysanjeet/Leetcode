class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long preElementSum=0;
        long result=-1;
        for(int num : nums){
            if(num < preElementSum){
                result=num + preElementSum;
            }
            preElementSum +=num;
        }
        return result;
    }
}