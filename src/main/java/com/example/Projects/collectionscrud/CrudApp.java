package com.example.Projects.collectionscrud;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudApp {
    static List<Employee> employeeList = new ArrayList<Employee>();

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            displayMenu();
            choice = sc.nextInt();
            System.out.println("Entered choice is:" + choice);
            switch (choice){
                case 1:
                    addEmployeeToList(sc);
                    break;
                case 2:
                    if(!CollectionUtils.isEmpty(employeeList)){
                        displayList();
                    }else{
                        System.out.println("List is empty");
                    }
                    break;
            }
            if(choice == 5)
                System.out.println("exiting.....");
        }while (choice != 5);
        System.out.println("Exiting the program. Thank you!");
        sc.close();

    }

    public static void addEmployeeToList(Scanner sc){
        System.out.println("Enter employee id :");
        int employeeId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name :");
        String eName = sc.nextLine();
        System.out.println("Enter employee salary :");
        float salary = sc.nextFloat();

        employeeList.add(new Employee(employeeId, eName, salary));
    }

    public static void displayMenu(){
        System.out.println("Enter the number of operation you want to perform on Employee list");
        System.out.println("1. Add employee to list");
        System.out.println("2. Print the employee list");
        System.out.println("3. Delete an employee from list");
        System.out.println("4. Update employee info");
        System.out.println("5. Exit");
    }

    public static void displayList(){
        System.out.println("Employee List is :");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
}
