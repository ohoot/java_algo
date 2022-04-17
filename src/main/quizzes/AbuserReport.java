package main.quizzes;

import java.util.*;

public class AbuserReport {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        Map<String, Integer> mailCntMap = new HashMap<>(reportSet.size());
        Map<String, Integer> reportedCntMap = new HashMap<>(reportSet.size());

        Set<String> abuserSet = new HashSet<>(reportSet.size());

        for (String element : reportSet) {
            String[] arr = element.split(" ");

            mailCntMap.put(arr[0], 0);
            reportedCntMap.put(arr[1], reportedCntMap.getOrDefault(arr[1], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : reportedCntMap.entrySet()) {
            if (entry.getValue() >= k) {
                abuserSet.add(entry.getKey());
            }
        }

        for (String element: reportSet) {
            String[] arr = element.split(" ");

            if (abuserSet.contains(arr[1])) {
                mailCntMap.put(arr[0], mailCntMap.getOrDefault(arr[0], 0) + 1);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCntMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
