package _FileReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class _FileWriter {

    public void exportToFile(String filename, ArrayList<City> budgetList) throws IOException {


        File fh = new File(filename);
        if (!fh.exists()) {
            fh.createNewFile();
        }

        FileWriter fw = new FileWriter(fh);

        try (BufferedWriter br = new BufferedWriter(new FileWriter(fh))) {
            br.write("Exporting first line of the text file!" + "\n");

            for (City b : budgetList) {
                br.write(b + "\n");
            }

            br.write("Exporting last line of the text file!");

        } catch (IOException e) {
            System.out.println("Unable to write file.");
        }
        fw.close();
    }


}