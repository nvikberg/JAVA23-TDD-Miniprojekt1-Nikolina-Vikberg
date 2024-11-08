package org.example;

public class PrimeCounter {

    //checking if a number is prime

    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    //count prime numbers within the range first and last
    public int countPrime(int first, int last) {
        if (first < 0 || last > 1000 || first > last) {
            System.out.println("Hoppsan, fel intervall angivet!");
            return 0;
        }
        int count = 0;
        for (int i = first; i <= last; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public int sumOfPrime(int first, int last) {
        if (first < 0 || last > 1000 || first > last) {
            System.out.println("Hoppsan, fel intervall angivet!");
            return 0;
        }
        int sum = 0;
        for (int i = first; i <= last; i++) {
            if (isPrime(i)) sum += i;
        }
        return sum;
    }

    public void printCount(int count) {
        System.out.println("hej! det finns " + count + "primtal mellan 0 och 1000!");
    }
    public void printSum(int sum) {
        System.out.println("den totala summan av dessa primtal är " + sum);
    }


    public static void main(String[] args) {
        PrimeCounter counter = new PrimeCounter();
        int count = counter.countPrime(0, 1000);
        int sum = counter.sumOfPrime(0, 1000);
        counter.printCount(count);
        counter.printSum(sum);

    }
}
