public class Employee {
    private String employeeName;
    private String fullEmployeeNumber;
    private String hireDate;

    public Employee(String name, String e, String date){
        employeeName = name ;
        hireDate = date;

        if(isValidEmpNum(e)){
            fullEmployeeNumber = e;
        } else {
            fullEmployeeNumber = "Unvalid number";
        }
    }

    public void setEmployeeName(String n){
        employeeName = n;
    }

    public void setHireDate(String d){
        hireDate = d;
    }

    public void setFullEmployeeNumber(String e){
        if (isValidEmpNum(e)) {
            fullEmployeeNumber = e;
        }
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getFullEmployeeNumber(){
        return fullEmployeeNumber;
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
}


