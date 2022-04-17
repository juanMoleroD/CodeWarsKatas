package kyu5.paginationhelper;

import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {

    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return -1;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return -1;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return -1;
    }
}

interface Item { }

class NumberItems implements Item {
    public int value;

    NumberItems(int value) {
        this.value = value;
    }
}