package kyu4.rankingsystem.romannumbershelper;

import java.util.ArrayList;
import java.util.List;

public class RomanHelper {

    List<String> romanReference = new ArrayList<>(List.of("I", "IV", "V", "IX", "X", "XL", "L")) ;
    List<Integer> numberReference = new ArrayList<>(List.of(1,4,5,9,10,40,50));

    public String toRoman(int number) {
        if (numberReference.contains(number)) return romanReference.get(numberReference.indexOf(number));
        return "-1";
    }

    public int toNumber(String number) {
        return -1;
    }
}
