package pl.ksolutions.leetcode.algorithms.easy;

import pl.ksolutions.leetcode.algorithms.annotations.TimeLimitExceeded;

/**
 * Difficulty: Easy
 * <p>
 * Description:
 * <p>
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Credits:
 * Special thanks to @mithmatt for adding this problem and creating all test cases.
 * <p>
 * Hint:
 * <p>
 * Let's start with a isPrime function. To determine if a number is prime, we need to check if it is not divisible by any number less than n.
 * The runtime complexity of isPrime function would be O(n) and hence counting the total prime numbers up to n would be O(n2). Could we do better?
 *
 * @author Karol Kornecki
 */
public class Count_Primes {

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j < n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        int primes = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primes++;
            }
        }
        return primes;
    }


    @TimeLimitExceeded
    public int countPrimes2(int n) {
        if (n <= 2) {
            return 0;
        }
        int counter = 0;
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
