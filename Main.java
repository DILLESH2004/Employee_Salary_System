
import java.util.*;


abstract class Employee{
    private String name;
    private int id ;
 
   public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
   public String getName(){
    return name;
   }
   public int getId(){
    return id; 
   }


   public abstract double calculateSalary();
 
   @Override
   public String toString(){
    return "Employee [name=" + name + ", id=" + id + ",salary "+calculateSalary()+"]";
   }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name,int id,double monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){       
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{

    private double hourRate;
    private int workedHours;
    public PartTimeEmployee(String name,int id,int workedHours,double hourRate){
        super(name,id);
        this.workedHours = workedHours;
        this.hourRate = hourRate;
    }

    @Override
    public double calculateSalary(){
        return hourRate*workedHours;
    }
}

class SalarySystem {
    private ArrayList<Employee> employeelist;

    public SalarySystem(){
        employeelist =  new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeelist.add(employee);
    }

    public void removeEmployee(int id){
        // Employee employeeToRemove  = null; 
        for(Employee i:employeelist){   
            if(i.getId()==id){
                employeelist.remove(i);
                break;
            }
        }
    }

    public void displayEmployees(){
        for(Employee i:employeelist){
            System.out.println(i);
        }
    }

    public void searchEmployee(int id){
        for(Employee i:employeelist){
            if(i.getId()==id){
                System.out.println(i);
            }
        }
    }
}



public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SalarySystem salarySystem = new SalarySystem();
        FullTimeEmployee Emp1 =  new FullTimeEmployee("Krishna",1,2000000.00);
        PartTimeEmployee Emp2 = new PartTimeEmployee("Ravi",2,40,20);

        salarySystem.addEmployee(Emp1);
        salarySystem.addEmployee(Emp2);
        System.out.println("Employee Details:");
        salarySystem.displayEmployees();
        System.out.println("Removing Employees:");
        int r = sc.nextInt();
        salarySystem.removeEmployee(r);
        System.out.println("Remaining Employee Details:");
        salarySystem.displayEmployees();
        salarySystem.searchEmployee(2);
        sc.close();
    }
}