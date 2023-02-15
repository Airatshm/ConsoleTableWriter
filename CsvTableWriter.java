package myclass39;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvTableWriter implements TableWriter, OutputFileWriter {

    @Override
    public void writeTable(Row[] table) {
        try {
            FileWriter fileWriter = new FileWriter("table.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < table.length; i++) {
                Row current = table[i];
                bufferedWriter.write(current.left + ";" + current.right + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getOutputPlace() {
        return "csv file: table.csv";
    }

    @Override
    public String getFileName() {
        return "table.csv";
    }
}
