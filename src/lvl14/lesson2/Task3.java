package lvl14.lesson2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * В классе Solution объявлены методы, которые тебе нужно реализовать следующим образом:
 * <p>
 *     removeBugWithFor(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for и счетчик.
 *     removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл while и метод iterator().
 *     removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for-each и копию списка.
 *     В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
 * <p>
 * Метод main реализован для вашего кода и не участвует в проверке.
 */

public class Task3 {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).toLowerCase().contains("bug")){
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            if(iterator.next().toLowerCase().contains("bug")){
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copyList = new ArrayList<>(list);

        for(String str: copyList){
            if(str.toLowerCase().contains("bug")){
                list.remove(str);
            }
        }
    }
}
