package com.softserve.Practical_tasks_Collections_part02;
import java.util.*;
public class Practical_task02 {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Prompt the user to enter ID-name-position-salary-dateOfBirth information
        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter position: ");
            String position = scanner.next();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter date of birth: ");
            String dateOfBirth = scanner.next();

            // Check for duplicate names
            if (names.contains(name)) {
                System.out.println("Duplicate name found. Cannot add to the map.");
                return; // Exit the program
            }

            // Create an Employee object with the provided information
            Employee employee = new Employee(name, position, salary, dateOfBirth);

            // Add ID-employee pair to the map
            employeeMap.put(id, employee);
            names.add(name);
        }

        // Display the contents of the map
        System.out.println("\nEmployee Map:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            int id = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("ID: " + id);
            System.out.println("Name: " + employee.getName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Date of Birth: " + employee.getDateOfBirth());
            System.out.println();
        }

        // Prompt the user to enter the ID of the record to modify
        System.out.print("Enter the ID of the record to modify: ");
        int idToModify = scanner.nextInt();

        // Check if the ID exists in the map
        if (employeeMap.containsKey(idToModify)) {
            // Get the existing employee object
            Employee employee = employeeMap.get(idToModify);

            // Prompt the user to enter the updated data
            System.out.print("Enter updated name (or press Enter to keep the existing value): ");
            scanner.nextLine(); // Consume the newline character
            String updatedName = scanner.nextLine().trim();
            if (!updatedName.isEmpty()) {
                employee.setName(updatedName);
            }

            System.out.print("Enter updated position (or press Enter to keep the existing value): ");
            String updatedPosition = scanner.nextLine().trim();
            if (!updatedPosition.isEmpty()) {
                employee.setPosition(updatedPosition);
            }

            System.out.print("Enter updated salary (or press Enter to keep the existing value): ");
            String updatedSalaryStr = scanner.nextLine().trim();
            if (!updatedSalaryStr.isEmpty()) {
                double updatedSalary = Double.parseDouble(updatedSalaryStr);
                employee.setSalary(updatedSalary);
            }

            System.out.print("Enter updated date of birth (or press Enter to keep the existing value): ");
            String updatedDateOfBirth = scanner.nextLine().trim();
            if (!updatedDateOfBirth.isEmpty()) {
                employee.setDateOfBirth(updatedDateOfBirth);
            }

            System.out.println("\nUpdated Employee Map:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                int id = entry.getKey();
                Employee updatedEmployee = entry.getValue();
                System.out.println("ID: " + id);
                System.out.println("Name: " + updatedEmployee.getName());
                System.out.println("Position: " + updatedEmployee.getPosition());
                System.out.println("Salary: " + updatedEmployee.getSalary());
                System.out.println("Date of Birth: " + updatedEmployee.getDateOfBirth());
                System.out.println();
            }
        } else {
            System.out.println("ID not found in the map.");
        }

        // Prompt the user to enter the sorting criterion
        System.out.print("Enter the sorting criterion (ID, name, position): ");
        String sortingCriterion = scanner.next();

        // Create a list of map entries
        List<Map.Entry<Integer, Employee>> sortedEntries = new ArrayList<>(employeeMap.entrySet());

        // Sort the list based on the chosen criterion
        switch (sortingCriterion) {
            case "ID":
                Collections.sort(sortedEntries, Map.Entry.comparingByKey());
                break;
            case "name":
                Collections.sort(sortedEntries, Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)));
                break;
            case "position":
                Collections.sort(sortedEntries, Map.Entry.comparingByValue(Comparator.comparing(Employee::getPosition)));
                break;
            default:
                System.out.println("Invalid sorting criterion.");
                return; // Exit the program
        }

        // Display the sorted map
        System.out.println("\nSorted Employee Map (by " + sortingCriterion + "):");
        for (Map.Entry<Integer, Employee> entry : sortedEntries) {
            int id = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("ID: " + id);
            System.out.println("Name: " + employee.getName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Date of Birth: " + employee.getDateOfBirth());
            System.out.println();
        }
    }
}

class Employee {
    private String name;
    private String position;
    private double salary;
    private String dateOfBirth;

    public Employee(String name, String position, double salary, String dateOfBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
