import javax.print.attribute.HashPrintJobAttributeSet;
import java.io.*;
import java.util.*;
import static java.util.Collections.sort;
public class GasPrices {
    public static void main(String[] args) throws IOException {

        // to read the GasPrices text file
        FileReader file = new FileReader("GasPrices.txt");
        Scanner gasFile = new Scanner(file);
        ArrayList<String> priceList = new ArrayList<>();

        while (gasFile.hasNext()) {
            String line = gasFile.next();
            priceList.add(line);
        }

        // MM-DD-YYYY:Price
        HashMap<String, double[]> mapYearSumCount = new HashMap<>();
        // MM : Price
        HashMap<String, double[]> mapMonthSumCount = new HashMap<>();

        for (String s : priceList) {
            String date = s.substring(0, 10);
            String price = s.substring(11);

            String date_month = date.substring(0, 2); // to identity the month of each line
            String date_year = date.substring(6, 10); // to identity the year of each line

            if (!mapYearSumCount.containsKey(date_year)) { // to validate and see whether the hashmap contains the year yet; if not then proceed this body of code.
                double[] sumAndCount = new double[2];
                sumAndCount[0] = 1; //count
                sumAndCount[1] = Double.parseDouble(s.substring(11)); //sum
                mapYearSumCount.put(date_year, sumAndCount); // put those values into this hashmap

            } else { // if the hashmap already has that date_year, then proceed this code
                double[] updatedSumCount = mapYearSumCount.get(date_year);
                updatedSumCount[0] += 1; //count
                updatedSumCount[1] += Double.parseDouble(s.substring(11)); //sum
                mapYearSumCount.put(date_year, updatedSumCount);

            }

            // same procedure with the date_year with the date_month
            if(!mapMonthSumCount.containsKey(date_month)){
                double[] sumAndCount1 = new double[2];
                sumAndCount1[0] = 1;
                sumAndCount1[1] = Double.parseDouble(s.substring(11));
                mapMonthSumCount.put(date_month,sumAndCount1);
            } else{
                double[] updatedSumAndCount1 = mapMonthSumCount.get(date_month);
                updatedSumAndCount1[0] += 1;
                updatedSumAndCount1[1] += Double.parseDouble(s.substring(11));
                mapMonthSumCount.put(date_month, updatedSumAndCount1);
            }
        }
        // make a new array list
        ArrayList<String> yearArray = null;
        yearArray = new ArrayList<>(List.of());
        double avgYear = 0;

        // go through the keyset() which is the list of years in the hashmap.
        for (String k : mapYearSumCount.keySet()) {
            yearArray.add(k); // add into the arrayList
        }
        // sort the year from the lowest to the highest
        Collections.sort(yearArray);
        System.out.println("Average price for each year from 1993 to 2013:");
        // to iterate over the arraylist of years to read the values and map it with its respective average price
        for(String i : yearArray){
            double[] sc = mapYearSumCount.get(i); // retrieve back the sum and count array of that year.
            avgYear = sc[1]/sc[0]; // sc[1] is the sum and sc[0] is the count.
            System.out.println(i + ": " + avgYear);
        }
        System.out.println("");

        // do the same procedure with the month.
        ArrayList<String> monthArray = new ArrayList<>(List.of());
        double avgMonth = 0;

        for(String k : mapMonthSumCount.keySet()){
            monthArray.add(k);
        }
        Collections.sort(monthArray);
        System.out.println("Average price for each month:");

        for(String i : monthArray){
            double[] mc = mapMonthSumCount.get(i);
            avgMonth = mc[1]/mc[0];
            System.out.println(i + ": " + avgMonth);
        }







    }
}
