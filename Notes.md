## Notes
#### Useful formulas, principles, etc. discovered while working on Project Euler problems

### Prime numbers
- The smallest factor of a number is prime.
- One can prime-factorize a number n by dividing n by its smallest factor, storing that factor, and repeating with the quotient (which is now the new n)
- A prime number has no prime factors; instead of testing a number n's primality by using every number before it as a divisor, use just every prime number before it as a divisor
- All prime numbers greater than 3 can be written in the form 6k +/- 1 (6k plus or minus 1), for k starting at k=1.
- Any number n can have only one prime factor greater than Math.sqrt(n).
- For any number n, place Math.sqrt(n) in the sequence of n's factors. Math.sqrt(n) will end up being the median. This does *not* mean that Math.sqrt(n) is *numerically equal to* the median of n's factors.

### Getting digits of a number
- For any number n, n%10 will retrive the rightmost digit.
- For any number n, n/10 will remove the rightmost digit.
- With the two principles above, one can get all the digits of a number without ever having to mess with toStrings, arrays, etc.

### Summing
- Please try to remember that the sum of all numbers from 1 to n is equal to n(n+1)/2