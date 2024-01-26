class Solution {
    //time- O(n) | space O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int r1=m-1;//start from end
      int r2=n-1;////start from end
      for(int w=m+n-1;w>=0;w--){
          if(r1>=0 && r2>=0){
           nums1[w]=nums1[r1]>nums2[r2] ? nums1[r1--]:nums2[r2--];
          }else if(r1>=0){
              nums1[w]=nums1[r1--];
          }else{
              nums1[w]=nums2[r2--];
          }
         
      }
      return;
        }

    //  public void merge(int[] nums1, int m, int[] nums2, int n) {
    //    for(int i=0;i<n;i++){
    //       nums1[i+m]=nums2[i];
    //        }
    //      Arrays.sort(nums1);
    //     }
}