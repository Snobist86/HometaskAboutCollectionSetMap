package HometaskAboutCollectionSetMap.TaskOne;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Map;

public class WordToString {

    public static void main(String[] args) {

        String text = "We will we will rock you, We will we will rock you. Buddy you are a young man hard man,";

        String textChanged = StringUtil.deletePunctuation(text);

        List<String> listString = new ArrayList<>(Arrays.asList(textChanged.split(" ")));

        Map<String, Integer> frequencyWord = StringUtil.transferListToMap(listString);

        StringUtil.printResult(frequencyWord);
    }


}

