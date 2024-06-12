# [143. Reorder Linked List](https://leetcode.com/problems/reorder-list/description/)

Given the head of a singly linked list, the goal is to reorder the list in a specific pattern without modifying the values in the nodes, only by changing the nodes themselves. The reordered list should follow the pattern:

L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …

## Examples

### Example 1
**Input:** head = [1,2,3,4]  
**Output:** [1,4,2,3]

### Example 2
**Input:** head = [1,2,3,4,5]  
**Output:** [1,5,2,4,3]

## Constraints
- The number of nodes in the list is in the range [1, 50,000].
- 1 <= Node.val <= 1000