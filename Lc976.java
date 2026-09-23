import java.util.Arrays;

class Solution {

    public int largestPerimeter(int[] arr) {

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 2; i--) {

            if (arr[i - 1] + arr[i - 2] > arr[i]) {
                return arr[i] + arr[i - 1] + arr[i - 2];
            }
        }

        return 0;
    }
}

/**
 * Lc976
 */
public class Lc976 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = {2, 1, 2};

        int result = solution.largestPerimeter(arr);

        System.out.println(result);
    }
    //done
}