Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.

Example 
1. Input: head = [0,1,2,3]
Output: [3,2,1,0]
2. Input: head = []
Output: []

Constraints:
1. 0 <= The length of the list <= 1000.
2. -1000 <= Node.val <= 1000

Solution:
1. Recursion: if the list is empty return null. Recursively call function head.next(). head.next.next = head & head.next = null to avoid cycles.
2. Iteration: using the three pointers curr,temp,prev,reverse each pointer.. Return prev in the end.