public class Single_Number {
    public int singleNumber(int[] nums) {
        // Use XOR cause A ^ A = 0 and A ^ 0 = A;
        // and hence A ^ A ^ B = B
        int result = 0;

        for (int x : nums) {
            result ^= x;
        }

        return result;

    }
}
