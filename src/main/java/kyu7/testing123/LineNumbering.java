package kyu7.testing123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineNumbering {
    public List<String> number(List<String> lines) {
        // TODO
        List<String> editedList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            editedList.add((i+1) + ": " + lines.get(i));
        }
        return editedList;
    }
}
