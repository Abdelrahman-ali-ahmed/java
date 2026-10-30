import java.util.Scanner;

public class day6 {

    private String studentName;
    private double studentScore;

    private static Scanner scanner = new Scanner(System.in);

    day6(String studentName, double studentScore) {
        this.studentName = studentName;
        this.studentScore = studentScore;
    }

    // Display one student
    void showStudent() {
        System.out.println("Student name: " + studentName);
        System.out.println("Student score: " + studentScore);
    }

    // Edit student name
    void editStudentName() {
        System.out.print("Enter student name: ");
        this.studentName = scanner.nextLine();
    }

    // Edit student score
    void editStudentScore() {
        System.out.print("Enter student score: ");
        this.studentScore = scanner.nextDouble();
        scanner.nextLine();
    }

    // Assign students
    static void assign(day6[] students) {

        for (int i = 0; i < students.length; i++) {
            students[i] = new day6("", 0);

            students[i].editStudentName();
            students[i].editStudentScore();
        }
    }

    // Display all students
    static void showStudentAll(day6[] students) {

        if (students.length == 0) {
            System.out.println("No students found.");
            return;
        }

        for (int i = 0; i < students.length; i++) {
            students[i].showStudent();
        }
    }

    // Calculate average
    static double studentAverage(day6[] students) {

        if (students.length == 0) {
            return 0;
        }

        double sum = 0;

        for (int i = 0; i < students.length; i++) {
            sum += students[i].studentScore;
        }

        return sum / students.length;
    }

    // Find highest score
    static double studentHighestScore(day6[] students) {

        if (students.length == 0) {
            return -1;
        }

        double max = students[0].studentScore;

        for (int i = 1; i < students.length; i++) {
            if (max < students[i].studentScore) {
                max = students[i].studentScore;
            }
        }

        return max;
    }

    // Reject invalid scores
    static void studentRejectedScore(day6[] students) {

        for (int i = 0; i < students.length; i++) {

            if (students[i].studentScore < 0 ||
                    students[i].studentScore > 100) {

                System.out.println(
                        students[i].studentName + " has an invalid score."
                );
            }
        }
    }}