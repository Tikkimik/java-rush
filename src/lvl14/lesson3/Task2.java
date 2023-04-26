package lvl14.lesson3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * В классе Solution объявлены методы:
 * reverse(ArrayList<Integer>),
 * sort(ArrayList<Integer>),
 * rotate(ArrayList<Integer>, int),
 * shuffle(ArrayList<Integer>).
 *
 * Тебе нужно разобраться, что делают методы, переписать их реализацию,
 * используя при этом только соответствующие методы класса Collections.
 */
public class Task2 {

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
