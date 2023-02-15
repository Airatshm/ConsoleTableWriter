package myclass39;

public interface TableWriter {
    void writeTable(Row[] table);
    String getOutputPlace();

    default void printTableHeaderToConsole(Row[] table) {
        System.out.println("Will print table with columns: " + table[0].left + " and " + table[0].right);


    }
}
