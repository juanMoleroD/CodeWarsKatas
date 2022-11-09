package kyu7.listfiltering;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream()
                .filter(Integer.class::isInstance)
                .collect(Collectors.toList());
    }
}
