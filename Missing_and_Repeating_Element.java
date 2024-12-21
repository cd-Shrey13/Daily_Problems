public class Missing_and_Repeating_Element {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int sizeOfArray = grid[0].length * grid[0].length + 1;

        int[] tempArray = new int[sizeOfArray];
        int[] result = new int[2];
        int missingValue = 0;
        int repeatedValue = 0;
        // I used a temp array to store frequecny of element

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int index = grid[i][j];
                tempArray[index]++;
            }
        }
        // iterrate over temp array to get the results

        for (int it = 0; it < tempArray.length; it++) {
            // frequency 0 means missing element

            if (tempArray[it] == 0)
                missingValue = it;
            // frequency 2 means repeating element

            if (tempArray[it] == 2)
                repeatedValue = it;
        }

        result[0] = repeatedValue;
        result[1] = missingValue;

        return result;

    }
}
