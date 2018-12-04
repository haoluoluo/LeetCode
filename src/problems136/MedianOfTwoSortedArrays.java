package problems136;

public class MedianOfTwoSortedArrays {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int [] A = nums1;
         int [] B = nums2;
         int m = nums1.length;
         int n = nums2.length;
         if(m > n){
             A = nums2;
             m = A.length;
             B = nums1;
             n = B.length;
         }
         int imin = 0;
         int imax = m;
         int haflen = (n+m+1)/2;
         while(imin <= imax){
             int i = (imin + imax) / 2;
             int j = haflen - i;
             if( i > imin  && A[i-1] > B[j]){
                 imax = (imin + imax + 1) /2;
             }else if( i < imax && A[i] < B[j-1]){
                 imin = (imin + imax + 1) /2;
             }else{
                 int maxLeft =0;
                 if(i==0){
                     maxLeft = B[j-1];
                 }else if(j==0){
                     maxLeft = A[i-1];
                 }else{
                     maxLeft = Math.max(A[i-1], B[j-1]);
                 }
                 if(((m + n) & 1)==1){
                     return maxLeft;
                 }

                 int minRight = 0;
                 if(i==m){
                     minRight = B[j];
                 }else if(j==n){
                     minRight = A[i];
                 }else{
                     minRight = Math.min(A[i], B[j]);
                 }
                 return (minRight+maxLeft) / 2.0;
             }
         }
         return 0.0;
    }


    public static void main(String[] args) {
       MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
       int [] A = {3};
       int [] B = {1,2,4};

       double re = m.findMedianSortedArrays(A,B);
        System.out.println(re);
    }
}
