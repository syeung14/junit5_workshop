package ora.course;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(PrimeNumberCheckerTest.class);

        for (Failure failure : res.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(res.wasSuccessful());
    }

}
