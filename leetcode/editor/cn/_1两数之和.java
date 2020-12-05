//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9767 👎 0


import java.util.HashMap;
import java.util.Map;

public class _1两数之和 {
    public static void main(String[] args) {
        Solution solution = new _1两数之和().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 时间复杂度: O(n)
         * 空间复杂度: O(n)
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> cache = new HashMap<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                int result = target - nums[i];
                Integer firstIndex = cache.get(result);
                if (null != firstIndex) {
                    return new int[]{firstIndex, i};
                }
                cache.put(nums[i], i);
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}