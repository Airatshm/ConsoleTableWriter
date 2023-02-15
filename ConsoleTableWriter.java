package myclass39;

public class ConsoleTableWriter implements  TableWriter {
    @Override
    public void writeTable(Row[] table) {
        for (int i = 0; i < table.length; i++) {
            Row current = table[i];
            System.out.println(current.left + "\t\t" + "|" + "\t\t" + current.right);
        }
    }

    @Override
    public String getOutputPlace() {
        return "console";
    }
}
