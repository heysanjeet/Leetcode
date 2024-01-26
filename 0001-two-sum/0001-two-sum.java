class Solution {
    //Time O(n) | space O(1)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> prevMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff),i};
            }
            prevMap.put(nums[i],i);
        }
        return new int[]{};
    }
  // time O(n^2) | space O(1)
  public int[] twoSumNaive(int[] nums, int target){
      for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j]==target){
                  return new int[]{i,j};
              }
          }
      }
      return new int[]{};
  }
}