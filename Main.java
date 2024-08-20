package java;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int arrayLen = nums.length;
        int[] result = new int[2];

        for (int i = 0; i < arrayLen - 1; i++) {
            for (int j = i + 1; j < arrayLen; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] index = twoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println("[" + index[0] + ", " + index[1] + "]");
    }

}
