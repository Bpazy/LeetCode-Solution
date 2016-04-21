package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] old = {0, 1, 2, 3, 0, 1, 0, 9};
        System.out.println(Arrays.toString(old));
        s.moveZeroes(old);
        System.out.println(Arrays.toString(old));
    }
}
