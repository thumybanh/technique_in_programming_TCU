import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Reads weekly gas price data from a file and analyzes it to determine the lowest and highest average gas prices of the year, as well as the
 * average gas price for each month.
 *
 * The program assumes a 52-week year and assigns each week to a month
 * based on the 1994 calendar.
 *
 * @author mybanh
 * @version 1.0
 * @since 2026-01-17
 */
public class Gas_Price {

    /**
     * Determines the month associated with a given week number based on the 1994 calendar.
     *
     * @param w the week number (1-52)
     * @return the name of the month in which the given week occurs
     */
    public static String month(int w) {
        String month = "";
        if (w <= 5) {
            return month = "January";
        } else if (w <= 9) {
            return month = "February";
        } else if (w <= 13) {
            return month = "March";
        } else if (w <= 17) {
            return month = "April";
        } else if (w <= 22) {
            return month = "May";
        } else if (w <= 26) {
            return month = "June";
        } else if (w <= 30) {
            return month = "July";
        } else if (w <= 35) {
            return month = "August";
        } else if (w <= 39) {
            return month = "September";
        } else if (w <= 44) {
            return month = "October";
        } else if (w <= 48) {
            return month = "November";
        } else return month = "December";
    }

    /**
     * The main body of the program. Reads gas price data from a file, calculates yearly minimum and maximum prices,
     * and computes the average gas price for each month.
     * @param args command-line arguments (not used)
     * @throws IOException if the input file cannot be read
     */
    public static void main(String[] args) throws IOException {
        FileReader fileInput = new FileReader("1994_Weekly_Gas_Averages.txt");
        Scanner scan = new Scanner(fileInput);
        ArrayList<Double> gasPrice = new ArrayList<>();

        while (scan.hasNextDouble()) {
            double num = scan.nextDouble();
            gasPrice.add(num);
        }

        //  Display the lowest average price of the year, along with the week number for that
        //  price, and the name of the month in which it occurred.

        double lowestAvgP = gasPrice.get(0);
        for (int i = 0; i < gasPrice.size(); i++) {
            if (lowestAvgP > gasPrice.get(i)) {
                lowestAvgP = gasPrice.get(i);
            }
        }
        System.out.println("Lowest average price of the year is " + lowestAvgP + "  " + "Week " + (gasPrice.indexOf(lowestAvgP) + 1) + "  " + "Month: " + month((gasPrice.indexOf(lowestAvgP) + 1)));


        //  Display the highest average price of the year, along with the week number for that
        //  price, and the name of the month in which it occurred.

        double highestAvgP = gasPrice.get(0);
        for (int i = 0; i < gasPrice.size(); i++) {
            if (highestAvgP < gasPrice.get(i)) {
                highestAvgP = gasPrice.get(i);
            }
        }
        System.out.println("Highest average price of the year is " + highestAvgP + "  " + "Week " + (gasPrice.indexOf(highestAvgP) + 1) + "  " + "Month: " + month((gasPrice.indexOf(highestAvgP) + 1)));


        //  Display the average gas price for each month.

        // Stores the number of weeks in each month
        int[] month_count = new int[12];
        // Stores the total gas price for each month
        double[] month_total = new double[12];
        // Names of the months indexed from January (0) to December (11)
        String[] month_name = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 1; i <= gasPrice.size(); i++) {
            switch(month(i)){
                case "January":
                    month_count[0] += 1;
                    month_total[0] += gasPrice.get(i-1);
                    break;
                case "February":
                    month_count[1] += 1;
                    month_total[1] += gasPrice.get(i-1);
                    break;
                case "March":
                    month_count[2] += 1;
                    month_total[2] += gasPrice.get(i-1);
                    break;
                case "April":
                    month_count[3] += 1;
                    month_total[3] += gasPrice.get(i-1);
                    break;
                case "May":
                    month_count[4] += 1;
                    month_total[4] += gasPrice.get(i-1);
                    break;
                case "June":
                    month_count[5] += 1;
                    month_total[5] += gasPrice.get(i-1);
                    break;
                case "July":
                    month_count[6] += 1;
                    month_total[6] += gasPrice.get(i-1);
                    break;
                case "August":
                    month_count[7] += 1;
                    month_total[7] += gasPrice.get(i-1);
                    break;
                case "September":
                    month_count[8] += 1;
                    month_total[8] += gasPrice.get(i-1);
                    break;
                case "October":
                    month_count[9] += 1;
                    month_total[9] += gasPrice.get(i-1);
                    break;
                case "November":
                    month_count[10] += 1;
                    month_total[10] += gasPrice.get(i-1);
                    break;
                case "December":
                    month_count[11] += 1;
                    month_total[11] += gasPrice.get(i-1);
                    break;
            }
        }
        System.out.println("");
        System.out.println("Month" + "  " + "Average price each month");
        for(int i = 0; i < month_total.length; i++){
            System.out.printf(month_name[i] + " " + "%.3f%n", (month_total[i]/month_count[i]));
        }

    }
}

