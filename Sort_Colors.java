public class Sort_Colors {

    public void sortColors(int[] nums) {
        //implemented counting sort
        if (nums.length != 1) {

            int[] arr = new int[3];

            for (int x : nums) {
                arr[x]++;
            }
            int i = nums.length - 1;
            int j = arr.length - 1;

            while (j > -1) {

                if (arr[j] > 0) {
                    nums[i] = j;
                    arr[j]--;
                    i--;
                } else
                    j--;

            }
        }
    }
}