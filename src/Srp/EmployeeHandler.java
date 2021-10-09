package Srp;

public class EmployeeHandler {
    public static void main(String[] args) {
        EmployeeRefactored emp=new EmployeeRefactored("Amit",21,81,2002);
        EmployeeEval evalemp=new EmployeeEval();
        evalemp.employeeEval(emp);

    }
}
