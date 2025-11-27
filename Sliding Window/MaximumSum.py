#Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k

#Time complexity:O(n) Space complexity:O(1)

def max_sum_subarray(arr, k):
    n = len(arr)

    # First window sum
    window_sum = sum(arr[:k])
    max_sum = window_sum

    i = 0
    j = k

    while j < n:
        window_sum = window_sum - arr[i] + arr[j]  # Slide the window
        max_sum = max(max_sum, window_sum)

        i += 1
        j += 1

    return max_sum



arr = list(map(int, input("Enter array elements separated by space: ").split()))
k = int(input("Enter value of k:"))
result = max_sum_subarray(arr, k)
print("Maximum sum subarray of size", k, "is:", result)



  

