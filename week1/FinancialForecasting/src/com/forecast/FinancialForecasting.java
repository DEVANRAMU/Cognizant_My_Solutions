package com.forecast;
public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) return principal;
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    // Optimized using memorization
    public static double futureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(principal, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.08; // 8% annual growth
        int years = 5;

        double futureRecursive = futureValueRecursive(principal, rate, years);
        System.out.println("Future Value (Recursive): " + futureRecursive);

        double[] memo = new double[years + 1];
        double futureMemo = futureValueMemo(principal, rate, years, memo);
        System.out.println("Future Value (With Memoization): " + futureMemo);
    }
}