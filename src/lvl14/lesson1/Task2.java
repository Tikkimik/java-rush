package lvl14.lesson1;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/*
Проверка присутствия
*/

public class Task2 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        //напишите тут ваш код
        if(words.contains(word)){
            System.out.printf("Слово %s есть в множестве%n", word);
        } else {
            System.out.printf("Слова %s нет в множестве%n", word);
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
