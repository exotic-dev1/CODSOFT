import java.util.Scanner;
public class StudentGradeCalculator {

    public static void main(String[] args) {
        int[] marks = new int[6];
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        scanner.close();
        avg = total / 6;
        
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", avg);
        System.out.print("The student Grade is: ");
    
        if (avg >= 80) {
            System.out.println("A");
        } else if (avg >= 60) {
            System.out.println("B");
        } else if (avg >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
