class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> count=new HashMap<>();
        for(int val : arr){
            count.put(val, count.getOrDefault(val, 0)+1); 
        }
         PriorityQueue<Integer> pq=new PriorityQueue<>(count.values());
        while(k >0){
            k -=pq.poll();
        }
        return k < 0 ? pq.size()+1 :pq.size();
    }
}