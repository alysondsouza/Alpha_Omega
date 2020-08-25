package _FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException { //FileNotFoundException is under IOException
        _FileReader fr = new _FileReader();
        ArrayList<City> budgetList;

        File fileName = new File("src/main/data/CityFileReader.csv");

        budgetList = fr.importFromFileArrList(fileName);
        for (City b : budgetList) {
            System.out.println(b);
        }

        _FileWriter fw = new _FileWriter();
        fw.exportToFile("src/main/data/CityFileWriter", budgetList);

    }
}

//OBJECT: CITY
class City {
    private int year;
    private String city;
    private double budget;

    public City(int year, String city, double budget) {
        this.year = year;
        this.city = city;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Year: " + year +
                "\t\t Budget: " + budget +
                "\t\t City: " + city;
    }
}