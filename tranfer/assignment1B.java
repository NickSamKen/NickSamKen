import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class assignment1B
{
   public static void main(String[] arg)
   {
      Scanner val = new Scanner(System.in);
      Scanner length = new Scanner(System.in);
      Scanner first = new Scanner(System.in);
      Scanner last = new Scanner(System.in);
      System.out.println("Enter number of students");
      int students = length.nextInt();
      Tests[] tests = new Tests[students];
      for(int x = 0 ; x < students; x++)
      {
         System.out.println("Enter first name of students");
         String fname = first.next();
         System.out.println("Enter last name of students");
         String lname = last.next();
         int sum = 0;
         double average = 0;
         int[] grade = new int[5];
         for(int i =0 ; i < grade.length; i++)
         {
            int num = i +1;
            System.out.println("Enter Test" + num);
            grade[i] = val.nextInt();
         }
         for(int i =0 ; i < grade.length; i++)
         {
            sum = grade[i] + sum;
         }
         average = sum/grade.length;
         tests[x] = new Tests(fname, lname, grade, average, students);
      }
      
      double classTotal = 0;
      System.out.println("First Name 	Last Name	Test1	Test2 	Test3 Test4	Test5   Average Grade");
      System.out.println();
      for(int x = 0 ; x < students; x++)
      {
         System.out.println(tests[x].ToString());
         classTotal += tests[x].avg;
      }
      
      double classAverage = classTotal/students;
      System.out.println("\nClass average "+classAverage);
   }
}
class Tests
{
   private String fn = "";
   private String ln = "";
   private int[] grades;
   public double avg = 0;
   private int lng = 0;
   
   public Tests(String fn, String ln, int[] grades, double avg, int lng) 
   {
      this.fn = fn;
      this.ln = ln;
      this.grades = grades;
      this.avg = avg;
      this.lng = lng;
   }
   
   public static String Grade(double average)
   {
      String letter = "";
      if(average >= 90)
      {
         letter = "A";
      }
      if(average < 90 && average >= 80)
      {
         letter = "B";
      }
      if(average < 80 && average >= 70)
      {
         letter = "C";
      }
      if(average < 70 && average >= 60)
      {
         letter = "D";
      }
      else
      {
         letter = "F";
      }
      return letter;
   }
   
   public String ToString()
   {
      String str = (fn +"\t"+ ln +"\t"+ grades[0] +"\t\t"+ grades[1] +"\t\t"+ grades[2] +"\t\t"+ grades[3] +"\t\t"+ grades[4] +"\t\t"+ avg +"\t\t"+ Tests.Grade(avg));
      return str;
   }
}
