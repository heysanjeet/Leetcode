class Solution {
    //time O(n) | space O(n)
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> numsSet=new HashSet<>();
      for(int i=0;i<nums.length;i++){
          if(numsSet.contains(nums[i])){
              return true;
          }
          numsSet.add(nums[i]);
      }
      return false;
    }
    //time O(n) | space O(n)
    public boolean containsDuplicate3(int[] nums){
        Map<Integer, Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(nums[i])){
                return true;
            }
            seen.put(nums[i], seen.getOrDefault(nums[i],0)+1);
        }
        return false;
    }
    
    //Time O(n) | space O(1)
    public boolean containsDuplicate2(int[] nums){
        int start=0;
        int end =nums.length-1;
        while(start<end){
            if(nums[start]==nums[end]){
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
    //time O(nlogn) | space O(1)
     public boolean containsDuplicate1(int[] nums){
         Arrays.sort(nums);
         for(int i=1;i<nums.length;i++){
             if(nums[i]==nums[i-1]){
                 return true;
             }
         }
         return false;
     }
     //Time O(n^2) | space O(1)
     public boolean containsDuplicateNaive(int[] nums){
         for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                     return true;
                 }
             }
         }
         return false;
     }
}