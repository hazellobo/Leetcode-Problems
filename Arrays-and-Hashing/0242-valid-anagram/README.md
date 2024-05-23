# [242. Anagram Checker Algorithm](https://leetcode.com/problems/valid-anagram/)

## Description

This algorithm checks if one string is an anagram of another string. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Problem Statement

### Input
- Two strings, `s` and `t`.

### Output
- `true` if `t` is an anagram of `s`.
- `false` otherwise.

### Examples

#### Example 1
- **Input:** `s = "anagram"`, `t = "nagaram"`
- **Output:** `true`

#### Example 2
- **Input:** `s = "rat"`, `t = "car"`
- **Output:** `false`

## Constraints
- `1 <= s.length, t.length <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters.