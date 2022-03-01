package kyu5.scramblies;

public class ScrambliesKata {

    public boolean scramble(String str1, String str2) {
        boolean strContainsLetter = false;

        for (int i = 0; i < str2.length();i++) {
            char currentLetter = str2.charAt(i);
            for(int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == currentLetter) strContainsLetter = true;
            }
        }

        return strContainsLetter;
    }
}
