package chap06;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        String[] names = {"하하", "굿", "rasdasda", "eaa", "asfasf", "dgnsdg", "a"};
        insertionSort(names);

        System.out.println(Arrays.toString(names));
    }

    public static void insertionSort(String[] names) {
        for (int i = 1; i < names.length; i++) {
            for (int j = 0; j <= i - 1; j++) {
                if (names[j].compareTo(names[i]) > 0) {
                    String tmp = names[i];

                    for (int k = i; k > j; k--) {
                        names[k] = names[k - 1];
                    }

                    names[j] = tmp;
                    break;
                }
            }
        }
    }
}
