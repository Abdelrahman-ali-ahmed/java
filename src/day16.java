import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class day16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> company = new ArrayList<>();

        int numberCase;
        int numberCase2;

        do {
            System.out.println("\n===== Employee Management =====");
            System.out.println("1: Add Employee");
            System.out.println("2: Display All Employees");
            System.out.println("3: Delete Employee");
            System.out.println("4: Search Employee");
            System.out.println("5: Find Employee  bigger than 10000");
            System.out.println("6: extract name" );
            System.out.println("7: sort by salary " );
            System.out.println("8: average salary " );
            System.out.println("9: Exit");

            System.out.print("Enter your choice: ");
            numberCase = scanner.nextInt();

            switch (numberCase) {

                // ADD EMPLOYEE
                case 1:

                    System.out.println("1: Developer");
                    System.out.println("2: Manager");

                    numberCase2 = scanner.nextInt();

                    while (numberCase2 > 2 || numberCase2 <= 0) {
                        System.out.println("Enter a valid choice:");
                        numberCase2 = scanner.nextInt();
                    }

                    Employee e = null;

                    if (numberCase2 == 1) {
                        e = new DeveloperDay14(scanner);
                    } else {
                        e = new ManagerDay14(scanner);
                    }

                    boolean duplicate = false;

                    for (Employee worker : company) {
                        if (worker.getId() == e.getId()) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (!duplicate) {
                        company.add(e);
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("This employee ID already exists!");
                    }

                    break;

                // DISPLAY ALL EMPLOYEES
                case 2:

                    if (company.isEmpty()) {
                        System.out.println("No employees available!");
                        break;
                    }

                    for (Employee worker : company) {
                        worker.displayInfo();
                        System.out.println("----------------");
                    }

                    break;

                // DELETE EMPLOYEE
                case 3:

                    if (company.isEmpty()) {
                        System.out.println("No employees available!");
                        break;
                    }

                    System.out.print("Enter employee ID to delete: ");
                    numberCase2 = scanner.nextInt();

                    boolean deleted = false;

                    Iterator<Employee> iterator = company.iterator();

                    while (iterator.hasNext()) {

                        Employee worker = iterator.next();

                        if (worker.getId() == numberCase2) {
                            iterator.remove();
                            deleted = true;
                            System.out.println("Employee deleted successfully!");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee not found!");
                    }

                    break;

                // SEARCH EMPLOYEE
                case 4:

                    if (company.isEmpty()) {
                        System.out.println("No employees available!");
                        break;
                    }

                    System.out.print("Enter the ID of employee: ");
                    numberCase2 = scanner.nextInt();

                    while (numberCase2 <= 0) {
                        System.out.print("Enter a valid ID: ");
                        numberCase2 = scanner.nextInt();
                    }

                    boolean found = false;

                    for (Employee worker : company) {

                        if (worker.getId() == numberCase2) {
                            worker.displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found!");
                    }

                    break;

                case 5:
                    findSalary(company);
                    break;
                case 6:
                    Extractname(company).stream().forEach(c->System.out.println("name:"+c));
                    break;
                case 7:
                    sortSalary(company);
                    break;
                case 8:
                    averageSalary(company);
                    break;
                // EXIT
                case 9:
                    System.out.println("Goodbye!");
                    break;


                default:
                    System.out.println("Invalid menu choice!");
            }

        } while (numberCase != 5);


    }

    static void findSalary (ArrayList<Employee> c){
        c.stream().filter(e->e.getSalary()>10000).forEach(e->System.out.println("name"+e.getName()));
    }
    static ArrayList<String> Extractname (ArrayList<Employee> c){
        ArrayList<String> res=  c.stream().map(e->e.getName()).collect(Collectors.toCollection(ArrayList::new));
        return res;
    }
    static void sortSalary(ArrayList<Employee> c) {
        c.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .forEach(e -> System.out.println(
                        "Name: " + e.getName() + " Salary: " + e.getSalary()
                ));
    }
    static void averageSalary (ArrayList<Employee> c){
        ArrayList<Double> arr= c.stream().map(e->e.getSalary()).collect(Collectors.toCollection(ArrayList::new));
        double average,sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        average=sum/arr.size();
        System.out.println("average: "+ average);
    }
}
