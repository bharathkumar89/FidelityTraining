package day6;

class EmployeeNotFound extends  Exception {
    public EmployeeNotFound (String message){
        super(message);
    }

}
class Employee{
    private int id;
    private String name;
    public  Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class EmployeeManager{
    private Employee[] employees;
    public EmployeeManager(Employee[]employees){
        this.employees=employees;
    }
    public Employee findEmployeeById(int id)throws EmployeeNotFound{
        for(Employee emp:employees){
            if (emp.getId()==id){
                return emp;
            }
        }
        throw new EmployeeNotFound("Employee with ID"+ id  +" "+ "Not Found");
    }
}
public class Main{
    public static void main(String[] args) {
        Employee[] employees={
                new Employee(1,"Mohan"),new Employee(2,"sai"),new Employee(3,"Mudigonda")
        };
        EmployeeManager manager=new EmployeeManager(employees);
        try {
            Employee emp=manager.findEmployeeById(5);
            System.out.println(" Employee found  " + emp.getName());
        }catch (EmployeeNotFound e){
            System.out.println(e.getMessage());
        }
    }
}