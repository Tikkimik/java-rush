package lvl14.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>),
 * которые выводят все элементы из переданных коллекций — списка и множества — с новой строки.
 * Твоя задача переписать методы на использование цикла for-each.
 * Метод main не участвует в проверке.
 */
public class Task2 {

    public static void printList(ArrayList<String> words) {
        // for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
        //     String word = iterator.next();
        //     System.out.println(word);
        // }

        for(String str: words){
            System.out.println(str);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        // Iterator<String> iterator = words.iterator();
        // while (iterator.hasNext()) {
        //     String word = iterator.next();
        //     System.out.println(word);
        // }

        for(String str: words){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}