# Minimum Size Subarray Sum
# (Two Pointer / Sliding Window)

#Time Cpmplexity:O(n) Space Complexity:O(1)

def minSubArrayLen(target, nums):
    left = 0
    current_sum = 0
    min_length = float('inf')

    for right in range(len(nums)):
        
        current_sum += nums[right]

     
        while current_sum >= target:
            min_length = min(min_length, right - left + 1)
            current_sum -= nums[left]
            left += 1
    return 0 if min_length == float('inf') else min_length


if __name__ == "__main__":
    target = 7
    nums = [2, 3, 1, 2, 4, 3]

    result = minSubArrayLen(target, nums)
    print("Minimum Subarray Length:", result)

