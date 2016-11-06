/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

/**
 *
 * @author Java
 */
public class Rational extends Number implements Comparable<Rational> {

    private long numerator = 0;
    private long denominator = 1;

    //default constructor
    public Rational() {
        this(0, 1);
    }

    //construct rational with given numerator and denominator
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    //find gcd
    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        return gcd;
    }

    //find lcm
    private static long lcm(long a, long b) {
        long s1 = a / gcd(a,b);
        return b * s1;
    }

    //return numerator
    public long getNumerator() {
        return numerator;
    }

    //return denominator
    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long lcm = lcm(denominator, secondRational.getDenominator());
        long lMult = lcm / denominator;
        long rMult = lcm / secondRational.getDenominator();
        long n = (numerator * lMult) + (secondRational.getNumerator() * rMult);
        return new Rational(n, lcm);
    }

    public Rational subtract(Rational secondRational) {
        /*long lcm = Math.abs(lcm(denominator, secondRational.getDenominator()));
        long lMult = lcm / secondRational.getDenominator();
        long rMult = lcm / denominator;
        long n = numerator * lMult - secondRational.getNumerator() * rMult;*/
        Rational negativeSecondRational = secondRational.multiply(-1);
        return add(negativeSecondRational);
    }

    public Rational multiply(Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }
    
    public Rational multiply(long i) {
        long n = i * numerator;
        return new Rational(n, denominator);
    }

    public Rational divide(Rational secondRational) {
        long n = numerator * secondRational.getDenominator();
        long d = denominator * secondRational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        if ((this.subtract((Rational) (other))).getNumerator() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(o).getDenominator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
