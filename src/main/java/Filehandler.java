import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Filehandler {
    RegionComparator rc = new RegionComparator();
    AldersgruppeComparator agc = new AldersgruppeComparator();
    private ArrayList<Covid19Data> covidData = new ArrayList<>();
    private Scanner sc;

    public void loadData() {
        try {
            File f = new File("covid19data.csv");
            sc = new Scanner(f, StandardCharsets.ISO_8859_1);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (!line.isEmpty() && !line.startsWith(";;;;;;")) {
                    String[] parts = line.split(";");
                    if (parts.length == 7) {
                        String region = parts[0];
                        String ageGroup = parts[1];
                        int confirmedCases = Integer.parseInt(parts[2]);
                        int deaths = Integer.parseInt(parts[3]);
                        int intensiveCare = Integer.parseInt(parts[4]);
                        String date = parts[5];

                        Covid19Data data = new Covid19Data(region, ageGroup, confirmedCases, deaths, intensiveCare, date);
                        covidData.add(data);
                    }
                }
            }
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void printCovidData(){
        for(Covid19Data data : covidData){
            System.out.println(data);
        }
    }
    public void ageGroupSort(){
        Collections.sort(covidData, new AldersgruppeComparator());
    }
    public void regionSort(){
        Collections.sort(covidData, new RegionComparator());
    }
}

