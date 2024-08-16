import java.util.Scanner;
public class IT24101701Lab4Q2 {

  public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
      	  System.out.print("Please enter exam marks (out of 100) : ");
          double exam_marks = input.nextDouble();
      
          if (exam_marks < 0 || exam_marks > 100) {

          	System.out.println("Invaid input for exam marks. Terminating program.");
          	return;
          	}

          System.out.print("Please enter the lab submission marks (out of 100) : ");
          double lab_marks = input.nextDouble();
           
          if (lab_marks < 0 || lab_marks > 100) {
          	System.out.print("Invalid input for exam marks. Terminating program.");
          	return;
          	}
          
          System.out.print("Please enter the percentage given for the exam : ");
          double exam_percentage = input.nextDouble();

          System.out.print("Please enter the percentage given for the lab : ");
          double lab_percentage = input.nextDouble();

          double percentage = exam_percentage + lab_percentage;
      
          if (percentage != 100) {
          	System.out.println("The percentage must add up to 100. Terminating program.");
          	return;
         	}
          double marks = exam_marks *exam_percentage / 100 + lab_marks * lab_percentage /100;

          System.out.println("Final Exam Mark is : " + marks);
       
         } 
}
    
