package kyu7.testing123;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineNumberingTest {

    LineNumbering testApp = new LineNumbering();
    List<String> testList = List.of( "line one", "line 2", "line3");

    @Test
    void doesFunctionReturnListWithLineNumber() {
        assertEquals(List.of("1: line one", "2: line 2", "3: line3"), testApp.number(testList));

    }
}