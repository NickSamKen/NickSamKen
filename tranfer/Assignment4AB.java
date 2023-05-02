import java.util.Scanner;
public class Assignment4AB
{

   public static void main(String[] args)
   {
      System.out.println("Enter a Number: ");
      Scanner scan1 = new Scanner(System.in);
      String num = scan1.nextLine();
      System.out.println("Then enter the desired base of the Number: ");
      Scanner scan2 = new Scanner(System.in);
      String convert = scan2.nextLine();
      int base = Integer.parseInt(convert);
      String result = tobase(num,base);
      System.out.println(result);
   }
   public static String tobase(String number,int base)
   {
      int num =Integer.parseInt(number);
      if(num <= base)
      {
         return "";
      }
      else
      {
         num = num/base;
         int remander = Integer.parseInt(number)%base;
         return Integer.toString(remander) + tobase(Integer.toString(num), base);
      }
   }
}