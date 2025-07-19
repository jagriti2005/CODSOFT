import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Student Grade Calculator ===");
        System.out.println("Enter marks for each subject (out of 100)");

        System.out.print("How many subjects do you have? ");
        int numSubjects = input.nextInt();
        if(numSubjects <= 0) {
            System.out.println("Invalid number of subjects!");
            return;
        }
        double[] marks = new double[numSubjects];
        String[] subjectNames = new String[numSubjects];
        System.out.println("\nEnter subject names and marks:");
        for(int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " name: ");
            input.nextLine(); 
            if(i == 0) input.nextLine();
            subjectNames[i] = input.nextLine();

            while(true) {
                System.out.print("Enter marks for " + subjectNames[i] + " (0-100): ");
                double mark = input.nextDouble();
                
                if(mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100");
                }
            }
        }

        double totalMarks = 0;
        for(int i = 0; i < numSubjects; i++) {
            totalMarks = totalMarks + marks[i];
        }

        double averagePercentage = totalMarks / numSubjects;

        String grade = "";
        String remarks = "";
        
        if(averagePercentage >= 90) {
            grade = "A+";
            remarks = "Outstanding Performance!";
        } else if(averagePercentage >= 80) {
            grade = "A";
            remarks = "Excellent Performance!";
        } else if(averagePercentage >= 70) {
            grade = "B+";
            remarks = "Very Good Performance!";
        } else if(averagePercentage >= 60) {
            grade = "B";
            remarks = "Good Performance!";
        } else if(averagePercentage >= 50) {
            grade = "C";
            remarks = "Average Performance";
        } else if(averagePercentage >= 40) {
            grade = "D";
            remarks = "Below Average - Need Improvement";
        } else {
            grade = "F";
            remarks = "Fail - Significant Improvement Required";
        }
        System.out.println("\n" + "=".repeat(40));
        System.out.println("         STUDENT GRADE REPORT");
        System.out.println("=".repeat(40));

        System.out.println("\nSUBJECT-WISE MARKS:");
        System.out.println("-".repeat(30));
        for(int i = 0; i < numSubjects; i++) {
            System.out.printf("%-20s: %.1f/100\n", subjectNames[i], marks[i]);
        }
        
        System.out.println("\nSUMMARY:");
        System.out.println("-".repeat(30));
        System.out.printf("Total Subjects       : %d\n", numSubjects);
        System.out.printf("Total Marks Obtained : %.1f out of %.1f\n", totalMarks, (double)(numSubjects * 100));
        System.out.printf("Average Percentage   : %.2f%%\n", averagePercentage);
        System.out.printf("Grade Achieved       : %s\n", grade);
        System.out.printf("Remarks              : %s\n", remarks);
        

        System.out.println("\nPERFORMANCE ANALYSIS:");
        System.out.println("-".repeat(30));

        double highest = marks[0];
        double lowest = marks[0];
        String bestSubject = subjectNames[0];
        String weakestSubject = subjectNames[0];
        
        for(int i = 1; i < numSubjects; i++) {
            if(marks[i] > highest) {
                highest = marks[i];
                bestSubject = subjectNames[i];
            }
            if(marks[i] < lowest) {
                lowest = marks[i];
                weakestSubject = subjectNames[i];
            }
        }
        
        System.out.printf("Best Performance     : %s (%.1f marks)\n", bestSubject, highest);
        System.out.printf("Needs Attention      : %s (%.1f marks)\n", weakestSubject, lowest);

        int passedSubjects = 0;
        for(int i = 0; i < numSubjects; i++) {
            if(marks[i] >= 40) {
                passedSubjects++;
            }
        }
        
        System.out.printf("Subjects Passed      : %d out of %d\n", passedSubjects, numSubjects);
        
        if(passedSubjects == numSubjects) {
            System.out.println("Status               : PASSED in all subjects! ✓");
        } else {
            System.out.println("Status               : Failed in " + (numSubjects - passedSubjects) + " subject(s)");
        }
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Thank you for using Grade Calculator!");
        
        input.close();
    }
}