# seg3103_playground

## Lab 04

### Prerequisite Step

Compile the app and test code with

```bash
javac -encoding UTF-8 --source-path src -d dist src/*.java && javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java
```

run

```bash
java -javaagent:lib/jacocoagent.jar -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

report and open it

```bash
java -jar lib/jacococli.jar report jacoco.exec --classfiles dist --sourcefiles src --html report

./report/index.html
```