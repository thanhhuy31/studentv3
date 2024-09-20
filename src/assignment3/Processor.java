
package assignment3;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        
        // Main program loop
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Update person");
            System.out.println("4. Delete person by ID");
            System.out.println("5. Find person by ID");
            System.out.println("6. Display all students and teachers");
            System.out.println("7. Find the student with the highest GPA");
            System.out.println("8. Find a teacher by department");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Code for adding a new student
                    break;
                case 2:
                    // Code for adding a new teacher
                    break;
                case 3:
                    // Code for updating a person
                    break;
                case 4:
                    // Code for deleting a person by ID
                    break;
                case 5:
                    // Code for finding a person by ID
                    break;
                case 6:
                    personList.displayEveryone();
                    break;
                case 7:
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top Student:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 8:
                    // Code for finding a teacher by department
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
