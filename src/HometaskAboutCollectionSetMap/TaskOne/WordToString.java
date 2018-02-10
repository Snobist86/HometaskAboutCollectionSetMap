package HometaskAboutCollectionSetMap.TaskOne;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordToString {

    public static void main(String[] args) {

        String text = "We will we will rock you, We will we will rock you. Buddy you are a young man hard man,";

        String textChanged = deletePunctuation(text);

        List<String> listString = new ArrayList<>(Arrays.asList(textChanged.split(" ")));

        Map<String, Integer> frequencyWord = transferListToMap(listString);

        System.out.println(text);

        printResult(frequencyWord);
    }

    private static void printResult(Map<String, Integer> frequencyWord) {
        for (Map.Entry note : frequencyWord.entrySet()) {
            System.out.println(note.getKey() + ": " + note.getValue());
        }
    }

    private static Map<String, Integer> transferListToMap(List<String> listString) {
        Map<String, Integer> frequencyWord = new HashMap<>();
        Integer numberOfWord;
        for (String s : listString) {
            if (!(frequencyWord.containsKey(s))) {
                frequencyWord.put(s, 1);
            } else {
                numberOfWord = frequencyWord.get(s);
                frequencyWord.replace(s, numberOfWord, ++numberOfWord);
            }
        }
        return frequencyWord;
    }

    private static String deletePunctuation(String text) {
        text = text.replaceAll("[\\.|,|!|\\?]", "");
        return text;
    }

    public static void printList(List<String> list) {
        for (String e : list) {
            System.out.print(e + " ");
        }
    }
}

