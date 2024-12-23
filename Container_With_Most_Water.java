public class Container_With_Most_Water {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int areaOfWater = 0;
        int maxAreaOfWater = 0;

        while (left < right) {
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);

            areaOfWater = width * height;
            maxAreaOfWater = Math.max(maxAreaOfWater, areaOfWater);
            if (height == heights[left])
                left++;
            else
                right--;
        }

        return maxAreaOfWater;

    }
}
