import java.util.*;
/**
 * A utility class containing generic methods for working with
 * Personn, Student, GraduateStudent, and Identifiable objects.
 * @author mybanh
 * @since 02-23-2026
 * @version 1.0
 */
public class UniversityUtils{
    /**
     * Prints information for all Personn objects in the given list.
     *
     * @param <T>  a type that extends Personn
     * @param list the list of Personn objects
     */
    public static <T extends Personn<?>> void printAll(List<T> list){
        for(T p : list){
            p.displayInfo();
        }
    }
    /**
     * Prints all elements of a generic array.
     *
     * @param <E>   the type of elements in the array
     * @param array the array to print
     */
    public static <E> void printArray(E[] array){
        for(E element : array){
            System.out.println(element);
        }
    }
    /**
     * Prints information for all Student objects in the given list.
     * Accepts a list of Student or any subclass of Student.
     *
     * @param list a list of Student objects or subclasses of Student
     */
    public static void printStudents(List<? extends Student<?>> list){
        for(Student<?> student : list){
            student.displayInfo();
        }
    }
    /**
     * Adds a GraduateStudent object to a list that can accept
     * GraduateStudent or any of its superclasses.
     *
     * @param list a list that accepts GraduateStudent or its superclasses
     */
    public static void addGraduateStudent(List<? super GraduateStudent> list){
        GraduateStudent grad = new GraduateStudent("AB123", "Priscilla", 4.0, "Thesis");
        list.add(grad);
    }
    /**
     * Prints the IDs of objects that implement the Identifiable interface.
     *
     * @param list a list of Identifiable objects
     */
    public static void printIds(List<? extends Identifiable<?>> list){
        for(Identifiable<?> id : list){
            System.out.println(id.getId());
        }
    }
    /**
     * Prints information for a single Personn object.
     *
     * @param <T>    a type that extends Personn
     * @param Person the Personn object to display
     */
    public static <T extends Personn<?>> void printPerson(T Person){
        Person.displayInfo();
    }
}

