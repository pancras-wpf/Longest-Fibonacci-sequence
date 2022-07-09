package 最长斐波那契数列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/*
* 如果序列 X_1, X_2, ..., X_n 满足下列条件，就说它是 斐波那契式 的：

n >= 3
对于所有 i + 2 <= n，都有 X_i + X_{i+1} = X_{i+2}
给定一个严格递增的正整数数组形成序列 arr ，找到 arr 中最长的斐波那契式的子序列的长度。如果一个不存在，返回  0

来源：力扣（LeetCode）

* */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Solution solution = new Solution();
        int a = solution.lenLongestFibSubseq(arr);
        System.out.println(a);
    }
}

class Solution {
    public int lenLongestFibSubseq(int[] A) {
        //从i开始，下一个是j
        int max = 2;
        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                int tmpI = A[i];
                int tmpJ = A[j];
                int sum = tmpI + tmpJ;
                int cur = 2;
                //存在
                while(Arrays.binarySearch(A, sum) >= 0){
                    tmpI = tmpJ;
                    tmpJ = sum;
                    sum = tmpI + tmpJ;
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }
        return max < 3 ? 0 : max;
    }
}