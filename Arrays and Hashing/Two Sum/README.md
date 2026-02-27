Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 
1. Input: nums = [3,4,5,6], target = 7
Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].
2. Input: nums = [4,5,6], target = 10
Output: [0,2]
3. Input: nums = [5,5], target = 10
Output: [0,1]

Constraints:
1. 2 <= nums.length <= 1000
2. -10,000,000 <= nums[i] <= 10,000,000
3. -10,000,000 <= target <= 10,000,000
4. Only one valid answer exists.

SOLUTION:
1. Brute force apprpach: computer sum of all pairs of numbers then check if any of them add upto target,return the indices of these two numbers. Time complexity: O(n^2)
2. HashMap: We can solve the problem in a single pass by iterating through the array and checking if the complement of the current element exists in the hash map. Return index which is key of complement along with i.

