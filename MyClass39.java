package myclass39;

import java.io.*;

public class MyClass39 {
    public static void main(String[] args) throws IOException {

        TableScanner tableScanner = new TableScanner();
        System.out.println("Please enter table...");
        Row[] table = tableScanner.scanTable();
        HtmlTableWriter tableWriter = new HtmlTableWriter();
        tableWriter.printTableHeaderToConsole(table);
        tableWriter.writeTable(table);
        System.out.println("Table written to " + tableWriter.getOutputPlace());
        readFile(tableWriter);
    }

    public static void readFile(OutputFileWriter writer) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(writer.getFileName()));
        String next = reader.readLine();
        while (next != null) {
            System.out.println(next);
            next = reader.readLine();
        }
    }
}
