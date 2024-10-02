
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
    return "Employee [name=" + this.name + ", id=" + this.id + ",salary "+calculateSalary()+"]";
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
        int flag =0;
        for(Employee i:employeelist){
            if(i.getId()==id){
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Employee not found");
        }
    }
}



public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SalarySystem salarySystem = new SalarySystem();
        Boolean flag = true;
        while (flag) {
            System.out.println("Choose Options :\n"+
            "1-> Add Employee\n"+
            "2-> Remove Employee\n"+
            "3-> Display Employees\n"+
            "4-> Search Employee\n"+
            "5->Exit()"
            );
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter employee type (FullTime/PartTime):");
                    String employeeType = sc.nextLine();
                    if (employeeType.equalsIgnoreCase("FullTime")) {
                        System.out.println("Enter employee name:");
                        String name = sc.nextLine();
                        System.out.println("Enter employee id:");
                        int id = sc.nextInt();
                        sc.nextLine(); 
                        System.out.println("Enter monthly salary:");
                        double monthlySalary = sc.nextDouble();
                        sc.nextLine(); 
                        FullTimeEmployee emp = new FullTimeEmployee(name, id, monthlySalary);
                        salarySystem.addEmployee(emp);
                    } else if (employeeType.equalsIgnoreCase("PartTime")) {
                        System.out.println("Enter employee name:");
                        String name = sc.nextLine();
                        System.out.println("Enter employee id:");
                        int id = sc.nextInt();
                        sc.nextLine(); 
                        System.out.println("Enter worked hours:");
                        int workedHours = sc.nextInt();
                        sc.nextLine(); 
                        System.out.println("Enter hour rate:");
                        double hourRate = sc.nextDouble();
                        sc.nextLine(); 
                        PartTimeEmployee emp = new PartTimeEmployee(name, id, workedHours, hourRate);
                        salarySystem.addEmployee(emp);
                    }
                    break;
                case 2:
                    System.out.println("Enter employee id to remove:");
                    int idToRemove = sc.nextInt();
                    sc.nextLine(); // Consume newline left-over
                    salarySystem.removeEmployee(idToRemove);
                    break;
                case 3:
                    salarySystem.displayEmployees();
                    break;
                case 4:
                    System.out.println("Enter employee id to search:");
                    int idToSearch = sc.nextInt();
                    sc.nextLine(); 
                    salarySystem.searchEmployee(idToSearch);
                    break;
                case 5:
                    flag = false;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }

        // FullTimeEmployee Emp1 =  new FullTimeEmployee("Krishna",1,2000000.00);
        // PartTimeEmployee Emp2 = new PartTimeEmployee("Ravi",2,40,20);

        // salarySystem.addEmployee(Emp1);
        // salarySystem.addEmployee(Emp2);
        // System.out.println("Employee Details:");
        // salarySystem.displayEmployees();
        // System.out.println("Removing Employees:");
        // int r = sc.nextInt();
        // salarySystem.removeEmployee(r);
        // System.out.println("Remaining Employee Details:");
        // salarySystem.displayEmployees();
        // salarySystem.searchEmployee(1);
        sc.close();
    }
}
