
package assignment3;

import java.util.ArrayList;


public class PersonList {
     private ArrayList<Person> personList;

    // Constructor
    public PersonList() {
        personList = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {
        personList.add(student);
    }

    // Add Teacher
    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
    }

    // Update Person by ID
    public void updatePerson(String id, Person updatedPerson) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.set(i, updatedPerson);
                break;
            }
        }
    }

    // Delete Person by ID
    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
    }

    // Find Person by ID
    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    // Display Everyone
    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
            System.out.println("----------------------------");
        }
    }

    // Find Top Student (highest GPA)
    public Student findTopStudent() {
        Student topStudent = null;
        float highestGpa = 0;

        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGpa() > highestGpa) {
                    highestGpa = student.getGpa();
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    // Find Teacher by Department
    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equalsIgnoreCase(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
}
