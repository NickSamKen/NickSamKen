import java.util.*;
import java.util.Scanner;
public class ClothStack
{
   public static void main(String[] args)
   {
      GenericStack<String> clothing = new GenericStack<>();
      do {
         System.out.println("enter the type of clothing");
         Scanner scan = new Scanner(System.in);
         String cloth = scan.nextLine();
         System.out.println("enter the color of the clothing");
         Scanner scan = new Scanner(System.in);
         String color = scan.nextLine();
         System.out.println("can the the clothing be washed at high Temperatures");
         Scanner scan = new Scanner(System.in);
         boolean washable = Boolean.parseBoolean(scan.nextLine());
         clothing.push("the type is " + cloth + " the color is " + color + "can it be cleaned at high temp " + washable);
         System.out.println("are all clothes all entered?");
         Scanner scan = new Scanner(System.in);
         boolean finished = Boolean.parseBoolean(scan.nextLine());
      }while(finished == false);
   }
}