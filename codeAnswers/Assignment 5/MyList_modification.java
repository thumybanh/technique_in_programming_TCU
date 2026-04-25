import java.lang.reflect.Array;
import java.util.*;

/**
 * This program has a generic class that stores elements in an ArrayList and provides methods to determine the largest and
 * smallest elements based on their natural ordering.
 * @param <T> the type of elements stored in the list; must implement Comparable
 *
 * @author mybanh
 * @since 02-16-2026
 * @version 1.0
 */
public class MyList_modification<T extends Comparable<T>> {
    ArrayList<T> arr = new ArrayList<>();

    /**
     * Adds an element to the list.
     * @param element
     */
    public void add(T element){
        arr.add(element);
    }

    /**
     * Return the largest value in the arrayList
     * @return the largest element in the list
     */
    public T largest(){
        T largestValue =  arr.getFirst();
        for (T t : arr) {
            if (t.compareTo(largestValue) > 0) {
                largestValue = t;
            }
        }
        return largestValue;
    }

    /**
     * Return the smallest value in the arraylist
     * @return the smallest element in the list
     */
    public T smallest(){
        T smallestValue = arr.getFirst();
        for (T t : arr) {
            if (t.compareTo(smallestValue) < 0) {
                smallestValue = t;
            }
        }
        return smallestValue;
    }

    /**
     * This program demonstrates the generic class through two types of object (integer and string)
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        //Create a new generic type Integer object
        MyList_modification<Integer> numbers= new MyList_modification<Integer>();
        numbers.add(4); // add to this object's arraylist
        numbers.add(8);
        System.out.println("Largest number is: " + numbers.largest()); // return the largest value in the array list
        System.out.println("Smallest number is: " + numbers.smallest()); // return the smallest value in the array list

        //Create a new generic type String object
        MyList_modification<String> words= new MyList_modification<String>();
        words.add("hello"); // add to this object's arraylist
        words.add("apple");
        System.out.println("highest word: " + words.largest()); //return the largest string value in the arraylist
        System.out.println("smallest word: " + words.smallest()); // return the smallest string value in the arraylist

    }

}
