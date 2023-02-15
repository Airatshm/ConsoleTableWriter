package myclass39;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileTableWriter implements  TableWriter, OutputFileWriter {
    String fileName;

    TextFileTableWriter(String inputFileName) {
        this.fileName = inputFileName;
    }
    @Override
    public void writeTable(Row[] table) {
        try {
            FileWriter fileWriter = new FileWriter(this.fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < table.length; i++) {
            Row current = table[i];
            bufferedWriter.write(current.left + "\t\t" + "|" + "\t\t" + current.right + "\n");
        }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getOutputPlace() {
        return "text file" + fileName;
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }
}
