import java.util.Scanner;

public class Employee {
    private int id;
    private  double salary;
    private  String name;

    protected double validEmployeeSalary(Scanner scanner){
while(true){
    try{
        System.out.print("please inter salary : ");
        double salaryf=scanner.nextDouble();
        if(salaryf>0){
            return salaryf;
        }else {
            throw new IllegalArgumentException("Enter a valid Salary!");
        }
    }catch (IllegalArgumentException e){
  System.out.println(e.getMessage());
    }
}
    }
    protected int validEmployeeId(Scanner scanner){
        while(true){
            try{
                System.out.print("please inter id : ");
                int idf=scanner.nextInt();
                if(idf>0){
                    return idf;
                }else {
                    throw new IllegalArgumentException("Enter a valid Id!");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
    protected String validEmployeeName(Scanner scanner){
        while(true){
            try{
                System.out.print("please inter name : ");
               String namef=scanner.nextLine();
                if(!namef.trim().isEmpty()){
                    return namef;
                }else {
                    throw new IllegalArgumentException("Enter a valid Name!");
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
    Employee(Scanner scanner){
        name=validEmployeeName(scanner);
        id=validEmployeeId(scanner);
        salary=validEmployeeSalary(scanner);

    }
    public void displayInfo(){
        System.out.println("ID: "+id);
        System.out.println("salary: "+salary);
        System.out.println("name: "+name);
    }
    public int getId() {return id;}
    public String getName(){return name;}
    public double getSalary(){return salary;}





}
