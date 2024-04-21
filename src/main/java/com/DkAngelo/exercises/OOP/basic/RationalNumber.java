package com.DkAngelo.exercises.OOP.basic;

import java.lang.Object;
import java.util.Objects;

public class RationalNumber {
    int numerator;
    int denominator;

    private static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    private static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
    public RationalNumber(int numerator, int denominator) {
        int greatestCommonDivisor = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator/greatestCommonDivisor;
        this.denominator = denominator/greatestCommonDivisor;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber o){
        int sumDenominator = leastCommonMultiple(denominator, o.getDenominator());
        int sumNumerator = ((sumDenominator/denominator) * numerator) +
                        ((sumDenominator/o.getDenominator()) * o.getNumerator());
        return new RationalNumber(sumNumerator, sumDenominator);
    }

    public RationalNumber multiply(RationalNumber o){
        return new RationalNumber(numerator*o.getNumerator(), denominator*o.getDenominator());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
