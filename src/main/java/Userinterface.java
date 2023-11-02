import java.util.Scanner;

public class Userinterface {
    Scanner sc = new Scanner(System.in);
    Filehandler fh = new Filehandler();


    public void start() {
        String userInput = sc.nextLine();
        while (true) {
            switch (userInput) {
                case "sort by age" -> {
                    fh.ageGroupSort();
                    fh.start();
                }
                case "sort by region" -> {
                    fh.regionSort();
                    fh.start();
                }
            }
        }
    }
}
