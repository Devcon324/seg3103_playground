# seg3103_playground

## Lab 04

### Prerequisite Step

I compile and run tic and fizzbuzz
![image](./assets/)

### Testing FizzBuzz in JAVA

I chose to work on the FizzBuzz project and implemented FizzBuzzTest.java

FizzBuss prints "Fizz", "Buzz", FizzBuzz" or the inputted number:

- for multiples of 3, the program should print "Fizz" instead of the number.
- for multiples of 5, it should print "Buzz".
- For numbers that are multiples of both 3 and 5, it should print "FizzBuzz".
- For all other numbers, it should simply print the number itself.

In this code, the fizzbuzz function takes a single argument n, which represents the number up to which we want to print the FizzBuzz sequence. The function uses the cond construct in Elixir, which allows us to define multiple conditions and their corresponding actions.

``` bash
javac -encoding UTF-8 --source-path src -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar src/*.java
javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```