package org.example;

public class SumCalculator {
    int sum(int n) {
        int result = 0;
        if (n == 0)
            throw new IllegalArgumentException();

        while (n != 0) {
            result += n;
            n--;
        }
        return result;
    }
}
