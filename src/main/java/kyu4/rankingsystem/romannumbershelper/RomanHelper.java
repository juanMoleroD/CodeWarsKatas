package kyu4.rankingsystem.romannumbershelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RomanHelper {

    List<String> romanReference = new ArrayList<>(
            List.of("I", "IV", "V", "IX", "X", "XL", "L","XC","C","CD","D","CM","M")) ;
    List<Integer> numberReference = new ArrayList<>(
            List.of(1,4,5,9,10,40,50,90,100,400,500,900,1000));

    public String toRoman(int number) {
        int remain = number;
        StringBuilder result = new StringBuilder();
//        List<Integer> numberList = Arrays.stream(Integer.toString(number).split("")).map(Integer::parseInt).collect(Collectors.toList());
//        result = numberList.stream().map(digit -> romanReference.get(numberReference.indexOf(digit))).collect(Collectors.toList());

        while (remain != 0){
            for( int i = numberReference.size()-1; i >= 0; i--) {
                if (numberReference.get(i) - remain <= 0 ) {
                    result.append(romanReference.get(i));
                    remain -= numberReference.get(i);
                }
            }
        }



//        if (numberReference.contains(number)) return romanReference.get(numberReference.indexOf(number));

//        for (int i = 0; i < number; i++) result.append(romanReference.get(0));

        return result.toString();
    }

    public int toNumber(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++){
            String currentDigit = number.split("")[i];
            if (romanReference.contains(currentDigit)){
                if (i+1 != number.length()){
                    String nextDigit = number.split("")[i+1];
                    if (romanReference.indexOf(nextDigit) > romanReference.indexOf(currentDigit)) {
                        result -= numberReference.get(romanReference.indexOf(currentDigit));
                    } else result += numberReference.get(romanReference.indexOf(currentDigit));
                }
                else result += numberReference.get(romanReference.indexOf(currentDigit));
            }
        }
        return result;
    }
}
