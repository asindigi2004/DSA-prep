Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 
1. Input: s = "Was it a car or a cat I saw?"
Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
2. Input: s = "tab a cat"
Output: false
Explanation: "tabacat" is not a palindrome.

Constraints:
1. 1 <= s.length <= 1000
2. s is made up of only printable ASCII characters.

SOLUTION
Implement a method to check if the character is alphaNumeric,if it is then check it,else skip it.
1. Reverse the string and compare the two strings. If they are the same(ignoring the non alphanumeric characters) then it is a palindrome
2. have two pointers i and j on either side of the string, comparing and iterating according to if or not both i and j point to alphanumeric character or not.