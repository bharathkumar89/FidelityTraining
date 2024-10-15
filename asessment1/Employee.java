package Com.Assessment;

public class Employee {
    int id;
    String name;
    float basicSalary;
    float bonus;
    float netSalary;

    public void displayDetails() {
        System.out.println("Employee Id : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Basic Salary : " + basicSalary);
        System.out.println("Employee Bonus : " + bonus);
        System.out.println("Employee Net Salary : " + netSalary);
    }
}
class PermanentEmployee extends Employee{
    int Pf;

    public PermanentEmployee(int id, String name, float basicSalary, int pf){
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.Pf = pf;
        calculateNetSalary();
        calculateBonus();
    }
    void calculateNetSalary(){
        this.netSalary = this.basicSalary - this.Pf;
    }
    void calculateBonus() {
        if (Pf < 1000) {
            bonus = 0.1f * basicSalary;
        } else if (Pf < 1500) {
            bonus = 0.115f * basicSalary;
        } else if (Pf < 1800) {
            bonus = 0.12f * basicSalary;
        } else {
            bonus = 0.15f * basicSalary;
        }
    }
}

class TemporaryEmployee extends Employee{
    int dailyWages;
    int noOfDays;

    public TemporaryEmployee(int id, String name, int dailyWages, int noOfDays){
        this.id = id;
        this.name = name;
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
        this.basicSalary = dailyWages * noOfDays;
        calculateNetSalary();
        calculateBonus();
    }

    void calculateNetSalary(){
        this.netSalary = this.dailyWages * this.noOfDays;
    }

    void calculateBonus(){
        if(dailyWages < 1000){
            bonus = 0.15f * netSalary;
        }
        else if(dailyWages <1500){
            bonus = 0.12f * netSalary;
        }
        else if(dailyWages < 1750){
            bonus = 0.11f * netSalary;
        }
        else{
            bonus = 0.08f * netSalary;
        }
    }
}


public class EmployeePayment {
    public static void main(String[] args) {
        PermanentEmployee pemp = new PermanentEmployee(101, "Esther", 25000, 1500);
        System.out.println("Initialization 1(Permanent Employee):");
        pemp.displayDetails();
        System.out.println();

        TemporaryEmployee temp = new TemporaryEmployee(102, "Ganesh", 1500, 20);
        System.out.println("Initialization 2(Temporary Employee):");
        temp.displayDetails();
    }
}
