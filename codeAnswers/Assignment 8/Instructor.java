import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
    This class stores data about an instructor.
    @author mybanh
    @since 03-23-2026
    @version 1.0
*/

public class Instructor
{
   private String name;         // Name
   private String officeNumber; // Office number

   /**
      This constructor initializes the fields.
      @param n The instructor's name.
      @param office The office number.
   */

   public Instructor(String n, String office)
   {
      name = n;
      officeNumber = office;
   }

   /**
      The copy constructor initializes the object
      as a copy of another Instructor object.
      @param object2 The object to copy.
   */
   
   public Instructor(Instructor object2)
   {
      name = object2.name;
      officeNumber = object2.officeNumber;
   }

    /**
     * Compares two objects and are considered equal if they have the same office number.
     *
     * @param instructor   the reference object with which to compare.
     * @return true if objects are equal, otherwise false
     */
   @Override
   public boolean equals(Object instructor){
       if(!(instructor instanceof Instructor)) {
           return false;
       }
       Instructor instructor2 = (Instructor) instructor;
       return this.officeNumber.equals(instructor2.officeNumber);
   }

    /**
     * hashCode mthod returns the hashcode
     *  @return a hash code value for this instructor. The hash code is based on the office number.
     */

   @Override
   public int hashCode(){
       return officeNumber.hashCode();
   }

   /**
      getName method returns the instructor's name.
      @return The name field.
   */
   
   public String getName()
   {
      return name;
   }
   
   /**
      getOfficeNumber returns the instructor's office number.
      @return The instructor's office number.
   */
   
   public String getOfficeNumber()
   {
      return officeNumber;
   }

   /**
      toString method
      @return A string with the instructor
              information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Name: " + name + "\nOffice Number: " +
                   officeNumber;

      // Return the string.
      return str;
   }


   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       Set<Instructor> instructor = new HashSet<>();
       instructor.add(new Instructor("John", "CVM345"));
       instructor.add(new Instructor("Alexa", "CVM345"));
       instructor.add(new Instructor("bebe", "ILY3030"));

       for(Instructor instructor1 : instructor){
           System.out.println(instructor1);
       }
       System.out.println("Search for instructor by number: ");
       String search = scan.next();

       boolean found = false ;
       for(Instructor person : instructor){
           if (person.getOfficeNumber().equals(search)){
               System.out.println(person);
               found = true ;
           }
       }
       if(!found){
           System.out.println("not found");
       }



   }
}