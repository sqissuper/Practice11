import java.util.ArrayList;
import java.util.List;

public class Main1 {
    //交替合并字符串
//    public String mergeAlternately(String word1, String word2) {
//        StringBuilder sb = new StringBuilder();
//        int a = word1.length();
//        int b = word2.length();
//        int i = 0,j = 0;
//        while(i < a && j < b) {
//            sb.append(word1.charAt(i) + "");
//            sb.append(word2.charAt(j) + "");
//            i++;
//            j++;
//        }
//        while(i < a) {
//            sb.append(word1.charAt(i) + "");
//            i++;
//        }
//        while(j < b) {
//            sb.append(word2.charAt(j) + "");
//            j++;
//        }
//        return sb.toString();
//    }

    //整数的各位积和之差
//    public int subtractProductAndSum(int n) {
//        int sum1 = 1;
//        int sum2 = 0;
//        while(n > 0) {
//            int tmp = n % 10;
//            sum1 *= tmp;
//            sum2 += tmp;
//            n /= 10;
//        }
//        return sum1 - sum2;
//    }

    //有多少小于当前数字的数字
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] ret = new int[nums.length];
//        int k = 0;
//        for(int i = 0; i < nums.length; i++) {
//            int tmp = nums[i];
//            int count = 0;
//            for(int j = 0; j < nums.length; j++) {
//                if(nums[j] < tmp) {
//                    count++;
//                }
//            }
//            ret[k++] = count;
//        }
//        return ret;
//    }

    //检查两个字符串数组是否相等
//    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        StringBuilder sb1 = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();
//        for(int i = 0; i < word1.length; i++) {
//            sb1.append(word1[i]);
//        }
//        for(int i = 0; i < word2.length; i++) {
//            sb2.append(word2[i]);
//        }
//        String s1 = sb1.toString();
//        String s2 = sb2.toString();
//        if(s1.length() != s2.length()) return false;
//        for(int i = 0; i < s1.length(); i++) {
//            if(s1.charAt(i) != s2.charAt(i)) {
//                return false;
//            }
//        }
//        return true;
////      return sb1.toString().equals(sb2.toString());
//    }

    //三个数的最大乘积
//    public static int maximumProduct(int[] nums) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        return Math.max(nums[0] * nums[1] * nums[n - 1],nums[n - 1] * nums[n - 2] * nums[n - 3]);
//    }

    //存在连续三个奇数的数组
//    public static boolean threeConsecutiveOdds(int[] arr) {
//        if(arr.length < 3) return false;
//        for(int i = 0; i <= arr.length - 3; i++) {
//            if(arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
//                return true;
//            }
//        }
//        return false;
//    }

    //存在重复元素 II
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = n - 1; j > i ; j--) {
//                if(nums[i] == nums[j] && Math.abs(i - j) <= k) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    // 找出数组游戏的赢家
//    public static int getWinner(int[] arr, int k) {
//        int count = 0;
//        int win = arr[0];
//        for(int i = 1; i < arr.length && count < k; i++) {
//            if(win > arr[i]) {
//                count++;
//            } else {
//                win = arr[i];
//                count = 1;
//            }
//        }
//        return win;
//    }

    //三角形最小路径和
    //没有通过全部测试用例
//    public static int minimumTotal(List<List<Integer>> triangle) {
//        int n = triangle.size();
//        int sum = 0;
//        if(n == 1) return triangle.get(0).get(0);
//        sum += triangle.get(0).get(0);
//        int j = 0;
//        for(int i = 1; i < n; i++) {
//            if(triangle.get(i).get(j) < triangle.get(i).get(j + 1)) {
//                sum += triangle.get(i).get(j);
//            } else {
//                sum += triangle.get(i).get(j + 1);
//                j = j + 1;
//            }
//        }
//        return sum;
//    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,10,4,2,3,5};
//        System.out.println(findLengthOfShortestSubarray(arr));
//        int[] nums = {1,11,22,33,44,55,66,77,88,99};
//        int k = 1000000000;
//        System.out.println(getWinner(nums, k));
//        System.out.println(containsNearbyDuplicate(nums, k));
//        int[] arr = {1,3,2};
//        System.out.println(threeConsecutiveOdds(arr));
//        int[] nums = {1,2,3,4};
//        System.out.println(maximumProduct(nums));
//        String[] word1 = {"a", "cb"};
//        String[] word2 = {"ab", "c"};
//        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
