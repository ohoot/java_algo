package chap06;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        String[] names = {"하하", "굿", "rasdasda", "eaa", "asfasf", "dgnsdg", "a"};
        bubbleSort(names);

        System.out.println(Arrays.toString(names));
    }

    public static void bubbleSort(String[] names) {
        while (true) {
            int changedCnt = 0;

            for (int i = 0; i < names.length - 1; i++) {
                if (names[i].compareTo(names[i+1]) > 0) {
                    System.out.println(names[i] + " < - > " + names[i+1]);

                    String tmp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tmp;

                    changedCnt++;
                }
            }

            if (changedCnt == 0) break;
        }
    }
}
