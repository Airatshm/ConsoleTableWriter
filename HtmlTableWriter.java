package myclass39;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlTableWriter implements TableWriter, OutputFileWriter {

    @Override
    public void writeTable(Row[] table) {
        try {
            FileWriter fileWriter = new FileWriter("table.html");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("<table border=1><th><td>");
            Row header = table[0];
            bufferedWriter.write(header.left);
            bufferedWriter.write("</td><td>");
            bufferedWriter.write(header.right);
            bufferedWriter.write("</td><th></b>");
            for (int i = 1; i < table.length; i++) {
                Row current = table[i];
                bufferedWriter.write("<tr><td>" + current.left + "</td><td>" + current.right + "</td></tr>");
            }
            bufferedWriter.write("</table>");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getOutputPlace() {

        return "html file: table.html";
    }

    @Override
    public String getFileName() {
        return "table.html";
    }
}
