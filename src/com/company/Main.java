package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] old = {1, 2, 9, 9};
        int[] oldN = s.plusOne(old);
        System.out.println(Arrays.toString(oldN));
    }
}
