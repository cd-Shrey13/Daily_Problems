public class Maximum_Subarray {

    // It uses Kandanes's algorthm
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int i = 0;

        while (i < nums.length) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
                i++;
            } else
                i++;

        }

        return maxSum;

    }
}
