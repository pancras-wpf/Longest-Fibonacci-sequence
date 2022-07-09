# Longest-Fibonacci-sequence
如果序列 X_1, X_2, ..., X_n 满足下列条件，就说它是 斐波那契式 的：  n >= 3 对于所有 i + 2 &lt;= n，都有 X_i + X_{i+1} = X_{i+2} 给定一个严格递增的正整数数组形成序列 arr ，找到 arr 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0  来源：力扣（LeetCode）

思路想出来了，但是时间复杂度太高；
该算法用到了 Arrays.binarySearch() 算法 二分查找数组 可以降低时间复杂度；
