public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int indexForNums1 = m - 1;
        int indexForNums2 = n - 1;

        for (int i = nums1.length - 1; i >= 0; i--) {
            if (indexForNums1 < 0) {
                nums1[i] = nums2[indexForNums2];
                indexForNums2--;
            } else if (indexForNums2 < 0) {
                nums1[i] = nums1[indexForNums1];
                indexForNums1--;
            } else if (nums1[indexForNums1] >= nums2[indexForNums2]) {
                nums1[i] = nums1[indexForNums1];
                indexForNums1--;
            } else {
                nums1[i] = nums2[indexForNums2];
                indexForNums2--;
            }
        }

    }
}
