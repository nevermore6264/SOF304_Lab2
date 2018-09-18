package poly;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class App {
    public static void main(String[] args) throws Exception {
        JUnitCore core = new JUnitCore();
        Result result = core.run(MathFuncTest.class);
        System.out.println("RUN TEST: " + result.getRunCount());
        System.out.println("Fail test: " + result.getFailureCount());
        System.out.println("Ignored test: " + result.getIgnoreCount());
        System.out.println("Success : " + result.wasSuccessful());
    }
}
