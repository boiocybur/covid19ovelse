import java.util.Scanner;

public class Userinterface {
    Scanner sc = new Scanner(System.in);
    Filehandler fh = new Filehandler();

    public void start() {
        System.out.println("This is Covid-19 data for 2022.");
        System.out.println("To start, type either 'sort by age' or 'sort by region' or 'exit' to quit.");
        fh.start();

        while (true) {
            String userInput = sc.nextLine().trim().toLowerCase();

            switch (userInput) {
                case "exit":
                    sc.close();
                    return;
                case "sort by age":
                    fh.ageGroupSort();
                    fh.printCovidData();
                    break;
                case "sort by region":
                    fh.regionSort();
                    fh.printCovidData();
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        }
    }
}
