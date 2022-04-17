package main.sibata.chap06;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        String[] names = {"하하", "굿", "rasdasda", "eaa", "asfasf", "dgnsdg", "a"};
        selectionSort(names);

        System.out.println(Arrays.toString(names));
    }

    public static void selectionSort(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String min = names[i];
            for (int j = i+1; j < names.length; j++) {
                if (min.compareTo(names[j]) > 0) {
                    String tmp = names[j];
                    names[j] = min;
                    min = tmp;
                }
            }
            names[i] = min;
        }
    }

}
