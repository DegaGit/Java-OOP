package java_oop;

public class Employee {
    protected String first;
    protected String last;
    protected String email;
    private double salary;

    private static double raise_amt = 1.03;

    public Employee(String first, String last, double salary){
        this.first = first;
        this.last = last;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getEmail(){
        this.email = this.first + " " + this.last + "@gmail.com";
        return this.email;
    }

    public void raiseSalary(){
        this.salary = this.salary * Employee.raise_amt;
    }

    public static double calcYearComp(double salary){
        return salary * 12;
    }
}
