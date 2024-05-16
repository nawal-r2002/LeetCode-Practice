class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultIndices = new int[2];
        int sum = 0;
        int arrLen = nums.length;
        System.out.println(arrLen);
        for (int i = 0; i < arrLen - 1; i++) {
            sum = nums[i] + nums[i + 1];
            System.out.println(sum);
            if (sum == target) {
                resultIndices[0] = i;
                resultIndices[1] = i + 1;
                return resultIndices;
            }
        }
        return resultIndices;
    }
}