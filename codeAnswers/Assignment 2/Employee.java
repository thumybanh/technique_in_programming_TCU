public class Employee {
    private String employeeName;
    private int employeeNum;
    private char employeeLetter;
    private String fullEmployeeNumber;
    private String hireDate;

    private final char[] VALID_LETTERS = new char[]{'A', 'B', 'C', 'D', 'E', 'F','G','H','I', 'J', 'K', 'L', 'M'};

    public Employee(String name, String e, String date){
        employeeName = name ;
        hireDate = date;

        if(isValidEmpNum(e)){
            fullEmployeeNumber = e;
        }
    }

    public void setEmployeeName(String n){
        employeeName = n;
    }
    public void setEmployeeNum(int num){
        if (num <= 999 && num > 0){
            employeeNum = num;
        }
    }
    public void setEmployeeLetter(char l){
        for(char letters : VALID_LETTERS){
            if (l == letters) {
                employeeLetter = l;
                break;
            }
        }
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
    public int getEmployeeNum(){
        return employeeNum;
    }
    public char getEmployeeLetter(){
        return employeeLetter;
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
                    (!Character.isLetter(e.charAt(4))))
                status = false;
        }
        return status;
    }
}


