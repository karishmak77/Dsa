class Solution:   # time Complexity: O(n)  Space complexity:O(1)
    def rotate(self, nums: list[int], k: int) -> None:
        n = len(nums)
        k = k % n  # If k > n, reduce it
        nums.reverse()
        nums[:k] = reversed(nums[:k])
        nums[k:] = reversed(nums[k:])
        

arr = list(map(int, input("Enter array elements (space separated): ").split()))
k = int(input("Enter rotation value k: "))

solve = Solution()
solve.rotate(arr, k)

print("Rotated array:", arr)
