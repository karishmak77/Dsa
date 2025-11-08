#Time complexity:O(n)   Space Complexity:O(1)

# numbers = [2, 7, 11, 15]
# target = 9
# Output: [1, 2]

# user input
numbers = list(map(int, input("Enter sorted numbers separated by space: ").split()))
target = int(input("Enter target number: "))

# Initialize two pointers
left = 0
right = len(numbers) - 1

while left < right:
    current_sum = numbers[left] + numbers[right] 

    if current_sum == target:
        print(f"The indices are: [{left + 1}, {right + 1}]")
        break
    elif current_sum < target:
        left += 1
    else:
        right -= 1
