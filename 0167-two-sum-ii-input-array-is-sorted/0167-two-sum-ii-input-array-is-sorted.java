class Solution {
    //Time O(n) | space O(1)
    //set start pointer from 0 index and end pointer for end index, sum start and end value and check if the target is less than 
    //reduce end and increment start. if the target is equal sum return the index. 
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int complement=numbers[start]+numbers[end];
            if( complement == target){
                return new int[]{start+1,end+1};
            }if(complement>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{};
    }
}