## Synopsis

This is SEG_2303_LAB_02 code and screenshots for understanding tests in Junit 5 for checking a date

## Code Example


``` 

Run the application, I used the command
```bash
java --add-opens java.base/java.lang=ALL-UNNAMED -jar  user-registration-app-0.1.0.jar
```
Run ecs tests with
```bash
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

```bash
./bin/run 
Newmath (type 'exit' to exit program)
Numerator: 10
Demoninator: 5
10 / 5 = 2
Numerator: 20
Demoninator: 3
20 / 3 = 6
Numerator: exit
```

# Exercise 1

In this section, I used the test cases provided in the tutorial and manually ran the tests on the application. The results
are noted in the table below.

Test Case |  Expected Results             | Actual Results                   | Verdict(Pass, Fail, Inconclusive)
----------|-------------------------------|----------------------------------|----------------------------------
1         | registration request accepted | registration request accepted    | Pass
2         | registration request accepted | registration request accepted    | Pass
3         | registration request accepted | registration request accepted    | Pass
4         | registration request accepted | registration request accepted    | Pass
5         | Error1                          | Error1 and Error3                    | Fail
6         | Error3                          | Error1 and Error3                    | Fail
7         | Error3                          | Error3                             | Pass
8         | Error1                          | Error1                             | Pass

Test 1 and Result


# Exercise 2

Compile ecs source code with:
```bash
javac -encoding UTF-8 --source-path src -d dist src/*.java
```
Compile ecs test code with:
```bash
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java