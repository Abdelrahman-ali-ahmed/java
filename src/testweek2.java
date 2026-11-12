public class testweek2 {
    //        ArrayList<Employee> company = new ArrayList<>();
//
//        int numberCase;
//        int numberCase2;
//
//        do {
//            System.out.println("\n===== Employee Management =====");
//            System.out.println("1: Add Employee");
//            System.out.println("2: Display All Employees");
//            System.out.println("3: Delete Employee");
//            System.out.println("4: Search Employee");
//            System.out.println("5: Exit");
//
//            System.out.print("Enter your choice: ");
//            numberCase = scanner.nextInt();
//
//            switch (numberCase) {
//
//                // ADD EMPLOYEE
//                case 1:
//
//                    System.out.println("1: Developer");
//                    System.out.println("2: Manager");
//
//                    numberCase2 = scanner.nextInt();
//
//                    while (numberCase2 > 2 || numberCase2 <= 0) {
//                        System.out.println("Enter a valid choice:");
//                        numberCase2 = scanner.nextInt();
//                    }
//
//                    Employee e = null;
//
//                    if (numberCase2 == 1) {
//                        e = new DeveloperDay14(scanner);
//                    } else {
//                        e = new ManagerDay14(scanner);
//                    }
//
//                    boolean duplicate = false;
//
//                    for (Employee worker : company) {
//                        if (worker.getId() == e.getId()) {
//                            duplicate = true;
//                            break;
//                        }
//                    }
//
//                    if (!duplicate) {
//                        company.add(e);
//                        System.out.println("Employee added successfully!");
//                    } else {
//                        System.out.println("This employee ID already exists!");
//                    }
//
//                    break;
//
//                // DISPLAY ALL EMPLOYEES
//                case 2:
//
//                    if (company.isEmpty()) {
//                        System.out.println("No employees available!");
//                        break;
//                    }
//
//                    for (Employee worker : company) {
//                        worker.displayInfo();
//                        System.out.println("----------------");
//                    }
//
//                    break;
//
//                // DELETE EMPLOYEE
//                case 3:
//
//                    if (company.isEmpty()) {
//                        System.out.println("No employees available!");
//                        break;
//                    }
//
//                    System.out.print("Enter employee ID to delete: ");
//                    numberCase2 = scanner.nextInt();
//
//                    boolean deleted = false;
//
//                    Iterator<Employee> iterator = company.iterator();
//
//                    while (iterator.hasNext()) {
//
//                        Employee worker = iterator.next();
//
//                        if (worker.getId() == numberCase2) {
//                            iterator.remove();
//                            deleted = true;
//                            System.out.println("Employee deleted successfully!");
//                            break;
//                        }
//                    }
//
//                    if (!deleted) {
//                        System.out.println("Employee not found!");
//                    }
//
//                    break;
//
//                // SEARCH EMPLOYEE
//                case 4:
//
//                    if (company.isEmpty()) {
//                        System.out.println("No employees available!");
//                        break;
//                    }
//
//                    System.out.print("Enter the ID of employee: ");
//                    numberCase2 = scanner.nextInt();
//
//                    while (numberCase2 <= 0) {
//                        System.out.print("Enter a valid ID: ");
//                        numberCase2 = scanner.nextInt();
//                    }
//
//                    boolean found = false;
//
//                    for (Employee worker : company) {
//
//                        if (worker.getId() == numberCase2) {
//                            worker.displayInfo();
//                            found = true;
//                            break;
//                        }
//                    }
//
//                    if (!found) {
//                        System.out.println("Employee not found!");
//                    }
//
//                    break;
//
//                // EXIT
//                case 5:
//                    System.out.println("Goodbye!");
//                    break;
//
//                default:
//                    System.out.println("Invalid menu choice!");
//            }
//
//        } while (numberCase != 5);
}
