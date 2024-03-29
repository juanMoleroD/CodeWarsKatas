package kyu5.scramblies;

public class ScrambliesKata {

    public boolean scramble(String str1, String str2) {
        StringBuilder stringToCheck = new StringBuilder(str1);

        for (int i = 0; i < str2.length();i++) {
            String currentLetter = Character.toString(str2.charAt(i));

            if (stringToCheck.lastIndexOf(currentLetter) == -1) return false;
            int letterPositionOnStr = stringToCheck.lastIndexOf(currentLetter);

            stringToCheck.setCharAt(letterPositionOnStr, '0');
        }

        return true;
    }
}
