package kyu7.tojadencase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JadenCase {
        public String toJadenCase(String phrase) {
//            put your code below this comment
            if (phrase == null || Objects.equals(phrase, "")) return null;
            return Arrays.stream(phrase.split(" "))
                    .map(word -> word.substring(0,1).toUpperCase() + word.substring(1))
                    .collect(Collectors.joining(" "));
        }

}
