Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 
1. Input: nums = [1, 2, 3, 3]
Output: true

2. Input: nums = [1, 2, 3, 4]
Output: false

SOLUTION:
1. Brute Force Approach
Start from the 0th index, for every number,check till end of nums.Repeat for all nums[i].Time complexity: n^2
2. Sorting
Sorting groups identical elements together, so we can simply check adjacent positions to detect duplicates. Time complexity: nlogn
3. HashSet
Since hashsets cannot contain duplicate values. Iterate through nums and check if value exists in hashset already,if so return false,else add the value to hashset. Then after all values checked,return true. Time complexity: n