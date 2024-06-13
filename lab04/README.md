# seg3103_playground

## Lab 04

### Prerequisite Step

I compile and run tic and fizzbuzz
![image](.\assets\compile_tic.png)
![image](.\assets\compile_fizzbuzz.png)
![image](.\assets\run_tic.png)
![image](.\assets\run_fizzbuzz.png)

### FizzBuzz in JUnit Java

I chose to work on the FizzBuzz project and implemented FizzBuzzTest.java

You can compile and run the code while in the /lab04/fizzbuzz_tdd_java directory

``` bash
javac -encoding UTF-8 --source-path src -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar src/*.java && javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java && java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

FizzBuss prints "Fizz", "Buzz", FizzBuzz" or the inputted number:

- for multiples of 3, the program should print "Fizz" instead of the number.
- for multiples of 5, it should print "Buzz".
- For numbers that are multiples of both 3 and 5, it should print "FizzBuzz".
- For all other numbers, it should simply print the number itself.

Since we cannot use the Elixir code, the FizzBuzz.java code takes an integer and computes FizzBuzz.

There are 5 tests with 5 commits each, with the final commit as a refactor for all tests to remove any println debugging. there is not much time needed to spend between adding tests that succeed and fail, the code is very repetitive between tests and can be quickly implemented

All commits were used with concatenation

```bash
git add . ; git commit -m "message" ; git push origin main
```

![image](.\assets\commits.png)
