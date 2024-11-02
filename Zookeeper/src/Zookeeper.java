import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.io.File;
/*
Name: Kevin L
Project: A Zookeeper Interface
*/

class Zookeeper
{
    static void animalCam(int fileNum)
    {

        File fileOne = new File("Zookeeper/animals/camel.txt");
        File fileTwo = new File("Zookeeper/animals/fish.txt");
        File fileThree = new File("Zookeeper/animals/dog.txt");
        File fileFour = new File("Zookeeper/animals/cat.txt");

        switch (fileNum)
        {
            case 1:
                try
                {
                    Scanner animalScanner = new Scanner(fileOne);
                    while(animalScanner.hasNextLine())
                    {
                        String a = animalScanner.nextLine();
                        System.out.println(a);
                    }
                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                break;

            case 2:
                try
                {
                    Scanner animalScanner = new Scanner(fileTwo);
                    while(animalScanner.hasNextLine())
                    {
                        String a = animalScanner.nextLine();
                        System.out.println(a);
                    }
                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                break;

            case 3:
                try
                {
                    Scanner animalScanner = new Scanner(fileThree);
                    while(animalScanner.hasNextLine())
                    {
                        String a = animalScanner.nextLine();
                        System.out.println(a);
                    }
                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                break;

            case 4:
                try
                {
                    Scanner animalScanner = new Scanner(fileFour);
                    while(animalScanner.hasNextLine())
                    {
                        String a = animalScanner.nextLine();
                        System.out.println(a);
                    }
                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                break;
        }
    }

    static void animalAssignment(String animalSelection)
    {
        Random random = new Random();
        double randomOne = random.nextDouble(50,100);

        DateTimeFormatter a = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println("Animal type: " + animalSelection);
        System.out.println("Current time: " + LocalTime.now().format(a));
        System.out.printf("Current temperature: %.2f\n", randomOne);
        System.out.println();
    }

    public static void main(String args[])
    {
        int numberCode;
        do
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Which index do you want to access?\n1.Camel\n2.Fish\n3.Dog\n4.Cat\nInsert here> ");
            int animalIndex = scanner.nextInt();
            System.out.println();

            switch (animalIndex)
            {
                case 1:
                    animalAssignment("Camel");
                    animalCam(1);
                    break;

                case 2:
                    animalAssignment("Fish");
                    animalCam(2);
                    break;

                case 3:
                    animalAssignment("Dog");
                    animalCam(3);
                    break;

                case 4:
                    animalAssignment("Cat");
                    animalCam(4);
                    break;

                default:
                    System.out.println("Invalid!");
                    System.out.println();
                    break;

            }
            System.out.print("Wanna go again? Enter a NUMBER. Exit code is -1> ");
            numberCode = scanner.nextInt();
            System.out.println();

        }
        while(numberCode != -1);
    }
}