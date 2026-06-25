// LeetCode 3737 - Count Subarrays With Majority Element I
// Approach: Brute Force (O(n²))
// Count occurrences of target in every subarray and
// check if target is the majority element (2 * cnt > len).

public class Day9 {
    
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == target) cnt++;

                int len = j - i + 1;

                if (2 * cnt > len)
                    ans++;
            }
        }

        return (int)ans;
    
}
    
}
