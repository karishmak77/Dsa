#You are given the heads of two sorted linked lists list1 and list2.
# Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
# Return the head of the merged linked list.
# Definition for singly-linked list.

# Time complexity: O(n+m) space complexity:O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeTwoLists(self, list1, list2):
        dummy = ListNode()
        tail = dummy

        while list1 and list2:
            if list1.val <= list2.val:
                tail.next = list1
                list1 = list1.next
            else:
                tail.next = list2
                list2 = list2.next
            
            tail = tail.next

        
        if list1:
            tail.next = list1
        else:
            tail.next = list2

        return dummy.next


# Helper code to create and print linked lists (optional)
def create_list(arr):
    dummy = ListNode()
    tail = dummy
    for num in arr:
        tail.next = ListNode(num)
        tail = tail.next
    return dummy.next

def print_list(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")


# Example usage
list1 = create_list([1, 3, 5])
list2 = create_list([2, 4, 6])

sol = Solution()
merged = sol.mergeTwoLists(list1, list2)

print_list(merged)
