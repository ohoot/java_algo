package test.quizzes;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MarathonTest {
    @Test
    void map() {
        Map<String, Integer> map = new HashMap<>();
        map.put("test", 1);

        List<String> list = new ArrayList<>(3);

        Set<String> set = new HashSet<>();

        map.put("test", map.get("test") + 1);

        System.out.println(map.get("test123") == null);
    }
}