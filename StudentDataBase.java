import java.util.Scanner;

public class StudentDataBase {
    public static void main(String[] args) {
        // ask for number of student to be add//
        // ENTER number of new students//
        System.out.print("Enter number of new students to enroll :  ");
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        Student[] students = new Student[numOfStudents];
        for (int j = 0; j < numOfStudents; j++) {
            students[j] = new Student();
            students[j].enroll();
            students[j].payTution();
        }
        for (int j = 0; j < numOfStudents; j++) {
            System.out.println("********************");
            students[j].printDetails();
            System.out.println("********************");
        }
        scan.close();
    }

}