import java.util.Scanner;
public class StudentManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentName = "";
        int rollNo = 0;
        boolean isDataEntered = false;
        while (true) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Enter Student Details");
            System.out.println("2. View Student Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    studentName = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    rollNo = sc.nextInt();
                    isDataEntered = true;
                    System.out.println("Student details saved successfully!");
                    break;
                case 2:
                    if (isDataEntered) {
                        System.out.println("\n--- Student Details ---");
                        System.out.println("Name: " + studentName);
                        System.out.println("Roll No: " + rollNo);
                    } else {
                        System.out.println("No student data found. Please enter details first.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
