package lambda.kup;

import java.util.stream.Collectors;

public class DistinctWords {

    public DistinctWords_Interface distinctListOfWords = (distinctList) -> {

        return distinctList.stream().distinct().collect(Collectors.toList());
    };

}
