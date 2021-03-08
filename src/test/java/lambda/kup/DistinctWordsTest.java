package lambda.kup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DistinctWordsTest {

    @Test
    public void getDistincts() {

        DistinctWords distinctWords = new DistinctWords();

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java","scala","java","clojure","clojure"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("java","scala","clojure"));
        List<String> actual = distinctWords.distinctListOfWords.getDistincts(list);
        Assertions.assertEquals(actual, expected);

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("the", "three", "the", "three", "the", "three", "an", "an", "a"));
        ArrayList<String> expected1 = new ArrayList<>(Arrays.asList("the", "three", "an", "a"));
        List<String> actual1 = distinctWords.distinctListOfWords.getDistincts(list1);
        Assertions.assertEquals(actual1, expected1);



    }

}