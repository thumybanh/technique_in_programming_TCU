/**
 * The Employee class represents a general employee.
 * It stores basic employee information such as name, employee number, and hire date.
 *
 * This class serves as a superclass for other employee types.
 */
public class Employee {
    /** The employee's name. */
    private String name;
    /** The employee's employee number. */
    private String employeeNumber;
    /** The employee's hire date. */
    private String hireDate;

    /**
     * Constructs an Employee object with the specified values.
     * The employee number and hire date are validated before assignment.
     *
     * @param n    The employee's name
     * @param num  The employee's employee number
     * @param date The employee's hire date
     */
    public Employee(String n, String num, String date){
        name = n ;

        if(isValidEmpHiredDate(date)){
            hireDate = date;
        } else{
            hireDate = "Invalid date";
        }


        if(isValidEmpNum(num)){
            employeeNumber = num;
        } else {
            employeeNumber = "Unvalid number";
        }
    }

    /**
     * Default constructor that creates an Employee
     * with no initial values.
     */
    public Employee(){
    }

    /**
     * Sets the employee's name.
     *
     * @param n The employee's name
     */
    public void setName(String n){
        name = n;
    }
    /**
     * Sets the employee's hire date.
     *
     * @param h The employee's hire date
     */
    public void setHireDate(String h){
        hireDate = h;
    }
    /**
     * Sets the employee number if it is valid.
     *
     * @param e The employee number
     */
    public void setEmployeeNumber(String e){
        if (isValidEmpNum(e)) {
            employeeNumber = e;
        }
    }
    /**
     * Returns the employee's name.
     *
     * @return The employee's name
     */
    public String getName(){
        return name;
    }
    /**
     * Returns the employee's employee number.
     *
     * @return The employee number
     */
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    /**
     * Returns the employee's hire date.
     *
     * @return The hire date
     */
    public String getHireDate(){
        return hireDate;
    }
    /**
     * Validates an employee number.
     * The format must be three digits, a dash, and a letter from A to M.
     *
     * @param e The employee number to validate
     * @return true if the employee number is valid; false otherwise
     */
    private boolean isValidEmpNum(String e) {
        boolean status = true;

        if (e.length() != 5)
            status = false;
        else {
            if ((!Character.isDigit(e.charAt(0))) ||
                    (!Character.isDigit(e.charAt(1))) ||
                    (!Character.isDigit(e.charAt(2))) ||
                    (e.charAt(3) != '-') ||
                    (!Character.isLetter(e.charAt(4)) || e.charAt(4) > 'M' || e.charAt(4) < 'A'))
                status = false;
        }
        return status;
    }

    /**
     * Validates an employee hire date.
     * The format must be MM/DD/YYYY.
     *
     * @param d The hire date to validate
     * @return true if the hire date is valid; false otherwise
     */
    private boolean isValidEmpHiredDate(String d) {
        boolean statusDate = true;

        if (d.length() != 10)
            statusDate = false;
        else {
            if ((!Character.isDigit(d.charAt(0))) ||
                    (!Character.isDigit(d.charAt(1))) ||
                    (d.charAt(2) != '/') ||
                    (!Character.isDigit(d.charAt(3))) ||
                    (!Character.isDigit(d.charAt(4))) ||
                    (d.charAt(5) != '/') ||
                    (!Character.isDigit(d.charAt(6))) || (!Character.isDigit(d.charAt(7))) || (!Character.isDigit(d.charAt(8))) || !Character.isDigit(d.charAt(9)))
                statusDate = false;
        }
        return statusDate;
    }

    /**
     * Returns a string representation of the Employee object,
     * including name, employee number, and hire date.
     *
     * @return A formatted string describing the employee
     */
    public String toString(){
        String employee = "Name: " + name + "\nEmployee Number: " + employeeNumber + "\nHired Date: " + hireDate;
        return employee;
    }
}


