package javaflweektwodatastructures.arrays;

public class StudentManager {
    private String[] students;
    private int maxSize;
    private int currentSize;

    public StudentManager(int maxSize) {
        this.maxSize = maxSize;
        this.students = new String[maxSize];
        this.currentSize = 0;
    }

    public void addStudent(String name) {
        if (currentSize < maxSize) {
            students[currentSize++] = name;
            System.out.println("Added " + name + " to the list.");
        } else {
            System.out.println("Error: Array is full, cannot add more students.");
        }
    }

    public void searchStudent(String name) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (students[i].equals(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(name + " is in the list of students.");
        } else {
            System.out.println(name + " is not found in the list of students.");
        }
    }

    public void deleteStudent(String name) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (students[i].equals(name)) {
                found = true;
                // Shifting elements to fill the gap
                for (int j = i; j < currentSize - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[currentSize - 1] = null; // Setting last element to null
                currentSize--;
                System.out.println(name + " has been deleted from the list.");
                break;
            }
        }
        if (!found) {
            System.out.println(name + " is not found in the list of students.");
        }
    }

    public void displayStudents() {
        if (currentSize > 0) {
            System.out.println("List of Students:");
            for (int i = 0; i < currentSize; i++) {
                System.out.println(students[i]);
            }
        } else {
            System.out.println("No students in the list.");
        }
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager(5);
        studentManager.addStudent("Alice");
        studentManager.addStudent("Bob");
        studentManager.addStudent("Charlie");
        studentManager.addStudent("David");
        studentManager.addStudent("Eve");
        studentManager.displayStudents();
        studentManager.searchStudent("Bob");
        studentManager.deleteStudent("Charlie");
        studentManager.displayStudents();
    }
}
