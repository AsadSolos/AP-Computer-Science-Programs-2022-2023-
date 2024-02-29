//*************611742********
// Programmer: Muhammad Khurram
// Date: 10/13/2022
// Program Name:Lab2StudentDatabase_MAK
// Program Description: Prints out student information asked in prompt
//***************************
import java.util.Scanner;
public class Lab2StudentDatabase_MAK {

      public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
   
      //All primitives used:
      String inpName;
      String firstName, lastName, stuID, password, username;
      String stuPassword, stuUsername;
      int gradYear;
      
      // Getting information for student 3 from user
      System.out.print("Enter your first and last name: ");
      inpName = scan.nextLine();
      
      int space = inpName.indexOf(" ");
      firstName = inpName.substring(0, space);
      lastName = inpName.substring(space + 1);
      
      System.out.print("Enter your ID number: ");
      stuID = scan.nextLine();
      
      System.out.print("Enter your graduation year: ");
      gradYear = scan.nextInt();
      gradYear = gradYear%100;
      
      
      // Prints student1's info
      Student student1 = new Student();
      System.out.println(student1);
      
      Student student2 = new Student("Muhammad", "Khurram", "611742", 2024%100);
      System.out.println(student2);
      
      Student student3 = new Student(firstName, lastName, stuID, gradYear);
      System.out.println(student3);
      
      // Changes student3's password
      System.out.print("Enter a new password for student 3: ");
      stuPassword = scan.nextLine();
      stuPassword = scan.nextLine();
      student3.newPassword(stuPassword);
      
      // Changes student2's password
      System.out.print("Enter a username for student 2: ");
      stuUsername = scan.nextLine();
      student2.newUserName(stuUsername);

            
      // Getting student1's GPA
      student1.addClassGrade(3.0);
      student1.addClassGrade(3.7);
      student1.addClassGrade(3.5);
      student1.addClassGrade(4.5);
      
      // Getting student2's GPA
      student2.addClassGrade(2.7);
      student2.addClassGrade(3.4);
      student2.addClassGrade(2.5);
      
      // Setting locker combination for student1's locker
      double lockNum1, lockNum2, lockNum3;
      lockNum1 = (int)(Math.random() * 40) + 1;
      lockNum2 = (int)(Math.random() * 35) + 26;
      lockNum3 = (int)(Math.random() * 50) + 76;
      
      student1.setLockerCombo((int)lockNum1,(int)lockNum2,(int)lockNum3);
      
      // Prints out all student info
      System.out.println(student1);
      System.out.println(student2);
      System.out.println(student3);
      
      // Gets the difference of GPAs between students 1 and 2
      double gpaDiff = student1.getGPA() - student2.getGPA();
      System.out.println("The difference in gpas of " + student1.getFirstName() + " and " + student2.getFirstName() + " is: " + gpaDiff);
      
      // Finds out if students 2 and 3 are in the same grade
      System.out.println("Student 2 and Student 3 are in the same grade: " + student2.sameGrade(student3));
      }


}