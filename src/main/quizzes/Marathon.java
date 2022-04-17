package main.quizzes;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

    class BadRequestException extends RuntimeException{}

    public String solution(String[] participant, String[] completion) {
        int total = participant.length;

        if (1 > total || total > 100000) {
            throw new BadRequestException();
        }

        Map<String, Integer> compleMap = new HashMap<>(total);

        for (String name : completion) {
            compleMap.put(name, compleMap.getOrDefault(name, 0) + 1);
        }

        String answer = "";

        for (String name : participant) {
            if (compleMap.getOrDefault(name, 0) == 0) {
                answer = name;
                break;
            }

            compleMap.put(name, compleMap.get(name) - 1);
        }

        return answer;
    }
}
