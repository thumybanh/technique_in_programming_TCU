public class NumberAnalyzerDemo {
    public static void main(String[] args){
        Integer[] intArray = new Integer[]{3,2,5,9,10};
        Double[] doubleArray = new Double[]{2.3,9.8,5.8,2.5};

        NumberAnalyzer<Integer> intObj = new NumberAnalyzer<>(intArray);
        NumberAnalyzer<Double> doubleObj = new NumberAnalyzer<>(doubleArray);

        System.out.println("Highest integer number: " + intObj.highest());
        System.out.println("lowest integer number: " + intObj.lowest());
        System.out.println("total integer number: " + intObj.totalElement());
        System.out.println("average integer number: " + intObj.average());

        System.out.println("");

        System.out.println("Highest double number: " + doubleObj.highest());
        System.out.println("lowest double number: " + doubleObj.lowest());
        System.out.println("total double number: " + doubleObj.totalElement());
        System.out.println("average double number: " + doubleObj.average());



    }
}
