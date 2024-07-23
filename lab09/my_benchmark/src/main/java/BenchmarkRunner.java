import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import sampleProject.SampleCode;

public class BenchmarkRunner {
    static SampleCode runJMH = new SampleCode();
    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
            .include(".*" + SampleCode.class.getSimpleName() + ".*")
            .warmupIterations(1)
            .measurementIterations(1)
            .forks(1)
            .build();
        new Runner(opt).run();
    }
}
