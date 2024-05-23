# [Search Insert Position Algorithm](https://leetcode.com/problems/search-insert-position)

## Description

Given a sorted array of distinct integers and a target value, this algorithm returns the index if the target is found. If the target is not found, it returns the index where it would be if it were inserted in order. The algorithm achieves a runtime complexity of O(log n).

## Problem Statement

### Input
- `nums`: A sorted array of distinct integers.
- `target`: An integer value to search for.

### Output
- The index of the target if it is found in the array.
- The index where the target would be inserted if it is not found.

### Examples

#### Example 1
- **Input:** `nums = [1, 3, 5, 6]`, `target = 5`
- **Output:** `2`

#### Example 2
- **Input:** `nums = [1, 3, 5, 6]`, `target = 2`
- **Output:** `1`

#### Example 3
- **Input:** `nums = [1, 3, 5, 6]`, `target = 7`
- **Output:** `4`

## Constraints
- `1 <= nums.length <= 10^4`
- `-10^4 <= nums[i] <= 10^4`
- `nums` contains distinct values sorted in ascending order.
- `-10^4 <= target <= 10^4`
