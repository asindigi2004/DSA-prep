You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example: 
1. Input: s = "[]"
Output: true
2. Input: s = "([{}])"
Output: true
3. Input: s = "[(])"
Output: false
Explanation: The brackets are not closed in the correct order.

Constraints:
1 <= s.length <= 1000

Solution:
1. remove every occurance of pairs until none exist.If string empty at this point, return true. Time complexity: O(n^2)
2. Hava a stack. Iterate through string.Everytime open brackets encountered, push to stack, if closed bracket encountered,and the top element is the corresponding opening bracket, pop it. Hava a hashmap to keep track of pairs.