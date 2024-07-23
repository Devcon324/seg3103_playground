package sampleProject;
import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

// Benchmarking tags
@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)

public class SampleCode {
  private static final int ARRAY_SIZE = 1000;
  private int[] array;

  @Setup
  public void setup() {
    array = new int[ARRAY_SIZE];
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array[i] = i;
    }
  }

  @Benchmark
  public int sumArray() {
    int sum = 0;
    for (int i = 0; i < ARRAY_SIZE; i++) {
      sum += array[i];
    }
    return sum;
  }

  @Benchmark
  public int multiplyArray() {
    int product = 1;
    for (int i = 0; i < ARRAY_SIZE; i++) {
      product *= array[i];
    }
    return product;
  }
}
