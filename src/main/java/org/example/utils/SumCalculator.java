package org.example.utils;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        if (n <= 0) throw new IllegalArgumentException();
        int rez = 0;
        for (int i = 0; i <= n; i++) {
            rez += i;
        }
        return rez;
    }
}
