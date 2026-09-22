class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] a = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                a[k++] = nums1[i++];
            else
                a[k++] = nums2[j++];
        }
        while (i < nums1.length)
            a[k++] = nums1[i++];
        while (j < nums2.length)
            a[k++] = nums2[j++];
        int n = a.length;
        if (n % 2 == 1)
            return a[n / 2];
        return (a[n / 2 - 1] + a[n / 2]) / 2.0;   
    }
}