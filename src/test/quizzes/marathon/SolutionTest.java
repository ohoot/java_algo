package test.quizzes.marathon;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void map() {
        Map<String, Integer> map = new HashMap<>();
        map.put("test", 1);

        map.put("test", map.get("test") + 1);

        System.out.println(map.get("test123") == null);
    }
}