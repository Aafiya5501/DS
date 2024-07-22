import java.util.Scanner;

 public class lab6_2 {
  
     int Employee_ID;
     String Name;
     String Designation;
     double Salary;
    

    public Employee_Detail(int id, String name, String designation, double salary) {
        this.Employee_ID = id;
        this.Name = name;
        this.Designation = designation;
        this.Salary = salary;
    }
    
    
    public void displayDetails() {
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Salary: " + Salary);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        
       
        Employee_Detail emp = new Employee_Detail(empId, name, designation, salary);
        
       
        System.out.println("\nEmployee Details:");
        emp.displayDetails();
        scanner.close();
    }
}
