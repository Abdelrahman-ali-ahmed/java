import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String path=validPath(scanner);
        System.out.println("-----------------------------");
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
            System.out.println("9: write employee in file ");
            System.out.println("10: read employee from  file ");
            System.out.println("11: Exit");

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
                    day16.findSalary(company);
                    break;
                case 6:
                    day16.Extractname(company).stream().forEach(c->System.out.println("name:"+c));
                    break;
                case 7:
                    day16.sortSalary(company);
                    break;
                case 8:
                    day16.averageSalary(company);
                    break;
                case 9:
                    writeEmployeeData(company,path);
                // EXIT
                case 10:
                    readEmployeeData(company,path);
                    break;
                case 11:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

        } while (numberCase != 5);




        scanner.close();
    }

static String validPath(Scanner s) {
    String path;
        while (true){
            try {

                System.out.println("inter the path file");
                path = s.nextLine();
                if (path.matches("[a-zA-Z0-9_]+\\.txt")) {
                    return path;
                } else {
                    throw new IllegalArgumentException("inter valid name file");
                }
            }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        }





}
    static void writeEmployeeData(ArrayList<Employee> c, String path) {
        File file = new File(path);

        try {
            if (file.exists() && file.isFile()) {

                try (FileWriter fw = new FileWriter(file)) {
                    for (Employee e : c) {
                        fw.write( "ID: "+e.getId() + "\n");
                        fw.write("Name: "+e.getName() + "\n");
                        fw.write("Salary: "+e.getSalary() + "\n");
                        fw.write("-----------------------\n");
                    }
                }

                System.out.println("Data saved!");

            } else {
                System.out.println("File does not exist!");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void readEmployeeData(ArrayList<Employee> c, String path) {
        File file = new File(path);
        Employee e = null;

        try {
            if (file.exists() && file.isFile()) {

                try (Scanner reader = new Scanner(file)) {

                    while (reader.hasNextLine()) {
                        String line = reader.nextLine();

                        if (line.isEmpty()) {
                            continue;
                        }

                        char objectAttribute = line.charAt(0);

                        switch (objectAttribute) {

                            case 'I':
                                e = new Employee();
                                int id = Integer.parseInt(
                                        line.replace("ID: ", "")
                                );
                                e.setId(id);
                                break;

                            case 'N':
                                e.setName(line.replace("Name: ", ""));
                                break;

                            case 'S':
                                e.setSalary(Double.parseDouble(
                                        line.replace("Salary: ", "")
                                ));
                                break;

                            case '-':
                                if (e != null) {
                                    c.add(e);
                                    e = null;
                                }
                                break;
                        }
                    }

                    // Handle the last employee if there is no separator
                    if (e != null) {
                        c.add(e);
                    }
                }

                System.out.println("Employees loaded successfully!");

            } else {
                throw new IOException("File does not exist!");
            }

        } catch (IOException er) {
            System.out.println(er.getMessage());
        } catch (NumberFormatException er) {
            System.out.println("Invalid employee data: " + er.getMessage());
        }
    }




}