package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("________WELCOME TO MONOBANK 2.0________");
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your surname:");
            String surname = sc.nextLine();
            System.out.println("Hi " + name + " " + surname + ", how are you doing?");
            System.out.println("Let's start - enter your deposit amount ($):");
            int amount = sc.nextInt();
            System.out.println("Your yearly income: 2%");
            double yic = 0.02; //yearlyIncomeCoefficient
            System.out.println("Enter the duration of your deposit (years: 1, 2, 5):");
            int duration = sc.nextInt();
            System.out.println("Thanks for applying on deposit in uor bank!\n____________Please wait____________");
            double income = duration * (yic * amount) + amount; //I don't want to use loop or condition, so I decided to make deposit without complicate percent
            System.out.println("Congrats! In " + duration + " years you will have [" + income + "] to collect!");
            System.out.println("Thanks for using our service! Have a nice day!");
    }
}

