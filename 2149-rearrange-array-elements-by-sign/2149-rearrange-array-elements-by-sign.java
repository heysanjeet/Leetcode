class Solution {
    
    public int[] rearrangeArray(int[] nums) {
        
        int[] result=new int[nums.length];
        int positive=0;
        int negative=1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                result[positive]=nums[i];
                positive +=2;
            }else{
                result[negative]=nums[i];
                negative +=2;
            }
            
        }
        return result;
    }
    
    public int[] rearrangeArrayNaive(int[] nums) {
        List<Integer> v1=new ArrayList<>();
        List<Integer> v2=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        
        for(int num :nums){
            if(num > 0){
                v1.add(num);
            }else{
                v2.add(num);
            }
        }
        int index1=0;
        int index2=0;
        while(index1 < nums.length/2){
            result.add(v1.get(index1));
            index1++;
            result.add(v2.get(index2));
            index2++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}