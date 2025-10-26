#brute force approch
arr = [1, 2, 9, 4, 5]  #[ using two pointers technique]  
for i in range(len(arr)):
    for j in range(i + 1, len(arr)):
        if arr[i] > arr[j]:
            print("Not sorted")
            break
    else:
        continue
    break
else:
    print("Array is sorted")

#optimized code [ best case: O(1) worst case: O(n)]
arr1=[1,2,3,4,5]
for i in range (len(arr1)-1):
  if arr1[i]>arr1[i+1]:
    print("not sorted")
    break
else:
    print("sorted")
