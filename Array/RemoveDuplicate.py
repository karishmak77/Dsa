class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        if not nums:
            return 0

        i = 0  

        for j in range(1, len(nums)):
            if nums[j] != nums[i]:  
                i += 1             
                nums[i] = nums[j]  

        return i + 1  



nums = list(map(int, input("Enter sorted numbers : ").split()))
obj = Solution()
k = obj.removeDuplicates(nums)
print("Number of unique elements:", k)
print("Array after removing duplicates:", nums[:k])
