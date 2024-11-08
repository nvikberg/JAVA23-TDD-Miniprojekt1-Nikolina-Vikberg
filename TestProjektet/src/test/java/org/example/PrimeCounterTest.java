package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCounterTest {

    @Test
    @DisplayName("Test counting prime numbers 0-10")
    public void testCountPrimeNumbers0To10() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(4, counter.countPrime(0, 10), "count should be 4"); //2,3,5,7
    }

    @Test
    @DisplayName("Test sum of prime numbers 0-10")
    public void testSumPrimeNumbers0To10() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(17, counter.sumOfPrime(0, 10), "sum should be 17");//2+3+5+7=17
    }


    @Test
    @DisplayName("prime numbers between 1000")
    public void countPrimeNumbersToOneThousand() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(168, counter.countPrime(0,1000), "there should be 168 prime numbers 0-1000"); //168 prime numbers 0-1000
    }

    @Test
    @DisplayName("Test when it goes to negative range)")
    public void testInvalidRangeNegative() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(0, counter.countPrime(-5, 10), "should return 0");
        assertEquals(0, counter.sumOfPrime(-5, 10), "should return 0");
    }

    @Test
    @DisplayName("Test invalid range when it goes over 1000")
    public void testInvalidRangeAbove1000() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(0, counter.countPrime(0, 1001), "should return 0");
        assertEquals(0, counter.sumOfPrime(0, 1001), "shoudl return 0");
    }


    @Test
    @DisplayName("Test counting primes with no primes")
    public void testCountPrimeNumbersNoPrimes() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(0, counter.countPrime(4, 4), "no primes in 4 to 4");
    }

    @Test
    @DisplayName("Test start > end")
    public void testInvalidRangeStartGreaterThanEnd() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(0, counter.countPrime(10, 5), "start > end should return 0");
        assertEquals(0, counter.sumOfPrime(10, 5), "start > end should return 0");
    }

    @Test
    @DisplayName("Test upper bound 1000 to 1000")
    public void testUpperBound() {
        PrimeCounter counter = new PrimeCounter();
        assertEquals(0, counter.countPrime(1000, 1000), "should be 0");
        assertEquals(0, counter.sumOfPrime(1000, 1000), "sum should be 0 for 1000");
    }
}
