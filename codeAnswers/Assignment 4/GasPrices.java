import javax.print.attribute.HashPrintJobAttributeSet;
import java.io.*;
import java.util.*;
import static java.util.Collections.sort;

public class GasPrices {


    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("GasPrices.txt");
        Scanner gasFile = new Scanner(file);
        ArrayList<String> priceList = new ArrayList<>();


        while (gasFile.hasNext()) {
            String line = gasFile.next();
            priceList.add(line);
        }

        // MM-DD-YYYY:Price

        HashMap<String, double[]> mapYearSumCount = new HashMap<>();
        HashMap<String, double[]> mapMonthSumCount = new HashMap<>();

        for (String s : priceList) {
            String date = s.substring(0, 10);
            String price = s.substring(11);

            String date_month = date.substring(0, 2);
            String date_year = date.substring(6, 10);

            if (!mapYearSumCount.containsKey(date_year)) {
                double[] sumAndCount = new double[2];
                sumAndCount[0] = 1; //count
                sumAndCount[1] = Double.parseDouble(s.substring(11)); //sum
                mapYearSumCount.put(date_year, sumAndCount);

            } else {
                double[] updatedSumCount = mapYearSumCount.get(date_year);
                updatedSumCount[0] += 1; //count
                updatedSumCount[1] += Double.parseDouble(s.substring(11)); //sum
                mapYearSumCount.put(date_year, updatedSumCount);

            }

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

        ArrayList<String> yearArray = null;
        yearArray = new ArrayList<>(List.of());
        double avgYear = 0;

        for (String k : mapYearSumCount.keySet()) {
            yearArray.add(k);
        }
        Collections.sort(yearArray);
        System.out.println("Average price for each year from 1993 to 2013:");
        for(String i : yearArray){
            double[] sc = mapYearSumCount.get(i);
            avgYear = sc[1]/sc[0];
            System.out.println(i + ": " + avgYear);
        }
        System.out.println("");

        ArrayList<String> monthArray = new ArrayList<>(List.of());
//        monthArray = new ArrayList<>(List.of());
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
