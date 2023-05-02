package io;

import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class CheckFile
{

    public static void main(String[] args) throws IOException
    {
        System.out.println("provide file name");
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine() + ".txt";
        File origin;
        String content = "";
        try
        {
            origin = new File(original);
            content = new String(Files.readAllBytes(Paths.get(original)));
        }
        catch (Exception e)
        {
            System.out.println("the file \"" + original +"\"cant be read");
            System.exit(0);
        }
        while (true)
        {
            System.out.println("provide copy name");
            String copy = scan.nextLine() + ".txt";
            File copyFile;
            try
            {
                copyFile = new File(copy);

                if (copyFile.exists())
                {
                    System.out.println("would you like to override the existing file or change the file name?");
                    System.out.println(" please enter: \"override\"or \"change\"");
                    String chosenOption = scan.nextLine();
                    if (chosenOption.equals("override"))
                    {
                        FileWriter writeToCopy = new FileWriter(copyFile);
                        try (BufferedWriter buffwrite = new BufferedWriter(writeToCopy))
                        {
                            buffwrite.write(content);
                            buffwrite.close();

                            System.out.println("the contents of " + original + " were copied to file " + copy);
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error occured");
                        }

                        break;
                    }
                    else
                    {
                        if (!chosenOption.equals("change"))
                        {
                            System.out.println("neither \"change\" nor \"override\" were chosen, please use on of these options");
                        }
                    }
                }
            }
            catch (IOException e)
            {
                System.out.println("the copy file has a problem");
            }
        }
    }
}
