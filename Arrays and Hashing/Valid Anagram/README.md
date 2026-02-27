Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 
1. Input: s = "racecar", t = "carrace"
Output: true
2. Input: s = "jar", t = "jam"
Output: false

Constraints:
s and t consist of lowercase English letters.

SOLUTION
return false if length of two strings is not same.
1. Brute force approach: for every value of i in string s, check if corresponding exists in string t. Time complexity: n^2
2. Sorting approach: sort both strings,compare sorted strings. Time complexity: nlogn
3. HashMap,for countS and countT.then compare both using equals() method.