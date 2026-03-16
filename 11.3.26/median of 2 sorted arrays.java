class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n>m) return findMedianSortedArrays(nums2, nums1); // always binary search on smaller length arr

        int x = (n+m+1)/2; // numbers to be on left side of median
        
        int l = 0;
        int r = n;

        while(l<=r){

            int P1 = l + (r-l)/2; // number choosen from nums1 to be place on left
            int P2 = x - P1; // remaining numbers in nums1 will be on right

            // Left Half
            int x1 = P1==0? Integer.MIN_VALUE : nums1[P1-1]; // from nums1
            int x2 = P2==0? Integer.MIN_VALUE : nums2[P2-1]; // from nums2

            // Right Half
            int x3 = P1>=n? Integer.MAX_VALUE : nums1[P1]; // from nums1
            int x4 = P2>=m? Integer.MAX_VALUE : nums2[P2]; // from nums2

            if(x1<=x4 && x2<=x3){ // valid partition

                if((n+m)%2!=0){ // odd length
                    return Math.max(x1, x2);
                }else{ // even length 
                    return ((double)Math.max(x1, x2) + Math.min(x3, x4)) / 2.0;
                }

            }

            if(x1>x4){
                r = P1-1;
            }else{
                l = P1+1;
            }
        }
        return -1;
    }
}
