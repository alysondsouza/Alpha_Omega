package _FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Year,City,TravelBudget
//2004,Arevik,11002.46

public class _FileReader {

    public ArrayList<City> importFromFileArrList(File fileName) throws FileNotFoundException {
        ArrayList<City> returnArrList = new ArrayList<>();

        if (fileName.exists()) {
            Scanner scan = new Scanner(fileName);

            System.out.println(scan.nextLine());//Header

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArr = line.split(",");

                City saveTempLine;
                saveTempLine = new City(Integer.parseInt(lineArr[0]), lineArr[1], Double.parseDouble(lineArr[2]));
                returnArrList.add(saveTempLine);
            }
            scan.close();
        } else {
            throw new FileNotFoundException();
        }
        return returnArrList;
    }
}
