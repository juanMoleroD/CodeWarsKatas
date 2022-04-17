package kyu5.paginationhelper;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PaginationHelperTest {

    PaginationHelper<Item> helper = new PaginationHelper<Item>(List.of(
            new NumberItems(1),
            new NumberItems(6),
            new NumberItems(3),
            new NumberItems(4),
            new NumberItems(5),
            new NumberItems(6)
        ), 0);

    @Test
    void constructor_takes_array_ofItems_and_integer() {
        assertTrue(helper.equals(helper));
    }
}