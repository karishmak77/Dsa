#Time Complexity:O(n)^2  Space Complexity:O(1)

def threeSumClosest(nums, target):
    nums.sort()
    closest = float('inf')

    for i in range(len(nums) - 2):
        left = i + 1
        right = len(nums) - 1

        while left < right:
            total = nums[i] + nums[left] + nums[right]

            # Update closest sum
            if abs(total - target) < abs(closest - target):
                closest = total

            # Move pointers
            if total < target:
                left += 1
            else:
                right -= 1

    return closest
                
                

                
nums = [-1,1,0,2,-4]

print(threeSumClosest(nums))