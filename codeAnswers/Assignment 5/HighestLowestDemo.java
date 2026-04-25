import java.util.ArrayList;

public class HighestLowestDemo {
    public static void main(String[] args){

        Integer[] intArr= new Integer[]{4,2,6};
        String[] stringArr = new String[]{"hello", "my", "name"};

        HighestLowestElements<Integer> intList = new HighestLowestElements<>(intArr);
        HighestLowestElements<String> stringList = new HighestLowestElements<>(stringArr);

        System.out.println("Highest value: " + intList.highest());
        System.out.println("lowest value: " + intList.lowest());

        System.out.println("Highest value: " + stringList.highest());
        System.out.println("lowest value: " + stringList.lowest());
    }
}
