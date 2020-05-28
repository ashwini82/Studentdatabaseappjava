
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courseName = "";
    private static int courseFee = 600;
    private int tutionBalance = 0;
    private static int id = 1000;

    // constructor for name and year of student//
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student's first name : ");
        this.firstName = scan.nextLine();
        System.out.print("Enter Student's last name : ");
        this.lastName = scan.nextLine();
        System.out
                .print("1 for Freshmen \n2 for Sophmore \n3 for Junior \n4 for Seniors \nEnter Student's Grade Year :");
        this.gradeYear = scan.nextInt();
        setStudentId();
        // scan.close();
    }

    // generate student id//
    public void setStudentId() {
        id++;
        this.studentId = gradeYear + "" + id;

    }

    // enrollment method//
    public void enroll() {
        do {
            System.out.print("Enter course name to Enroll : (Q for quit) ");
            Scanner scan = new Scanner(System.in);
            String userAns = scan.nextLine();
            if (!userAns.equals("Q")) {
                courseName = courseName + "\n " + userAns;

                tutionBalance = tutionBalance + courseFee;
            } else {
                break;
            }

        } while (1 != 0);

    }

    // view balance//
    public void viewBalance() {
        System.out.println("Your Tutionbalance is : " + tutionBalance);
    }

    // paytution method//
    public void payTution() {
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.print("How much fee u want to pay ? ");
        int payment = scan.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank You for your payment of : " + payment + "$");
        viewBalance();
        // scan.close();
    }

    // print details//
    public void printDetails() {
        System.out.println("Details Of Student  : " + "\nStudent Name : " + firstName + " " + lastName
                + "\nCourses Enrolled : " + courseName + "\nGrade Level : " + gradeYear + "\nStudentId :" + studentId
                + "\nTution Balance : " + tutionBalance);
    }

}