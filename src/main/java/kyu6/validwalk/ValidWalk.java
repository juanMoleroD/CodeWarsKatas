package kyu6.validwalk;

public class ValidWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        if (walk.length == 10) {
            int x = 0, y = 0;
            for( char direction : walk ) {
                if (direction == 'n') y += 1;
                if (direction == 's') y -= 1;
                if (direction == 'e') x += 1;
                if (direction == 'w') x -= 1;
            }
            return x == 0 && y == 0;
        }
        return false;
    }
}
