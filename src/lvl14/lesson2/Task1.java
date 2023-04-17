package lvl14.lesson2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * В классе Task1 есть метод print(HashSet<String>),
 * который должен выводить в консоли все элементы множества, используя iterator().
 * Метод main не участвует в проверке.
 */
public class Task1 {
    public static void print(HashSet<String> words) {
        //напишите тут ваш код
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        //можно и попроще
//        for (String str : words) {
//            System.out.println(str);
//        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}