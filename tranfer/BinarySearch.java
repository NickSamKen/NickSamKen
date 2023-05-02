//Nicholas Kennel
//Lab2BBinary
import java.util.*;
import java.util.Random;
import java.util.Arrays;
public class BinarySearch
{
   public static void main(String[] arg)
   {
      int[] nums = {1, 4, 4, 22, -5, 10, 21, -47, 23};
      for(int i:nums)
      {
         System.out.print(i + ", ");
      }
      System.out.println();
      int key = binarySearch(sort(nums));
      if(key == -1)
      {
         System.out.println("Value not found in the array");
      }
      else 
      {
         System.out.println("Value is " + key);
      }
      
   }
   
   public static int[] sort(int[] arr)
   {
      int replace = 0;
      for(int y = 0; y < arr.length; y++)
      {
         for(int i = 0; i < arr.length; i++)
         {
            if(arr[i] > arr[y])
            {
               replace = arr[y];
               arr[y] = arr[i];
               arr[i] = replace;
            }
         
         }
      }
      for(int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + ", ");
      }
      System.out.println();
      return arr;
   }
   public static int binarySearch(int[] arr)
   {
      for(int i = 0; i < arr.length; i++)
      {
         System.out.print(arr[i] + ", ");
      }
      
      Random r = new Random();
      int key = r.nextInt(200)-101;
      int high = arr.length;
      int low = 0;
      System.out.println("key is: " + key);
      int medium = arr.length/2;
      int max = arr.length;
      int num = 0;
      for(int i = 0; i < arr.length; i++)
      {
         if(key == medium)
         {
            num = medium;
         }
         if(key > medium)
         {
            medium = (high + medium)/2;
            low = medium + 1;         
         }
         else
         {
            high = medium - 1;
            medium = (low + medium)/2;       
         }
      }
      if(num == 0)
      {
         return -1;
      }
      else
      {
         return num;
      }
   }
}