package lambda.kup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctWordsMain {

    public static void main(String[] args) {

        ArrayList<String> distinctList = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));

        DistinctWords distinctWords = new DistinctWords();

        List<String> distinct = distinctWords.distinctListOfWords.getDistincts(distinctList);

        System.out.println(distinct);


    }
}
