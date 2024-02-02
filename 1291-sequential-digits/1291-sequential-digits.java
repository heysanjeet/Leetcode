class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
       List<Integer> result=new ArrayList<Integer>();
        for(int i=1;i<=9;i++){
            int num=i;
            int nextDigit=i+1;
            
            while(num <=high && nextDigit<=9){
                num=num * 10 + nextDigit;
                if(low<=num && num <=high){
                    result.add(num);
                }
                nextDigit++;
            }
        }
        result.sort(null);
        return result;
    }
}