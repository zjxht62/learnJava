package corejava.chapter9.treeSet;

import java.util.Objects;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/10/8
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    /**
     * Constructs an item
     * @param aDescription
     * @param aPartNumber
     */
    public Item(String aDescription, int aPartNumber) {
        this.description = aDescription;
        this.partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "[description=" + description + ", partNumber=" + partNumber + "]";
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    @Override
    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber, other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }
}
