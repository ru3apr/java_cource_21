package com.learn;

public class EvenNumberCountSolution {
    public
    int findNumbers(int[] nums) {
        int totalEvens = 0;
        for (int  num: nums) {
            int digiCont = 0;
            while (num != 0) {
                num = num / 10;
                digiCont++;
            }
            if (digiCont % 2 == 0) {
                totalEvens++;
            }
        }
        return totalEvens;
    }
}
