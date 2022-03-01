package kyu5.scramblies;

public class ScrambliesKata {

    public boolean scramble(String str1, String str2) {
        boolean strContainsLetter = false;
        StringBuilder stringToCheck = new StringBuilder(str1);
        StringBuilder letterFound = new StringBuilder();

        for (int i = 0; i < str2.length();i++) {
            String currentLetter = Character.toString(str2.charAt(i));

            if (stringToCheck.lastIndexOf(currentLetter) == -1) return false;

            letterFound.append(stringToCheck.charAt(stringToCheck.lastIndexOf(currentLetter)));
            stringToCheck.setCharAt(stringToCheck.lastIndexOf(currentLetter), '0');
        }

        return true;
    }
}
