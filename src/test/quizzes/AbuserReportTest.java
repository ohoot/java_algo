package test.quizzes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AbuserReportTest {
    @Test
    void split() {
        String str = "test value";
        System.out.println(Arrays.toString(str.split(" ")));

        String[] arr = {"test", "value"};

        System.out.println(arr[0]);
    }
}
