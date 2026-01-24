public class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

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

    public Employee(){

    }

    public void setName(String n){
        name = n;
    }

    public void setHireDate(String h){
        hireDate = h;
    }

    public void setEmployeeNumber(String e){
        if (isValidEmpNum(e)) {
            employeeNumber = e;
        }
    }

    public String getName(){
        return name;
    }

    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public String getHireDate(){
        return hireDate;
    }

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


    public String toString(){
        String employee = "Name: " + name + "\nEmployee Number: " + employeeNumber + "\nHired Date: " + hireDate;
        return employee;
    }
}


