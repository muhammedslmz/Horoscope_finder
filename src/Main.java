import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your birth month and day for looking your horoscope.");
        System.out.print("Month: ");
        String month=input.nextLine();

        System.out.print("Day: ");
        int day=input.nextInt();

        if (month.toUpperCase().equals("JANUARY"))
        {
            if (day<=20) System.out.println("Your horoscope is: Goat");
            else System.out.println("Your horoscope is: Water Bearer");
        }
        else if (month.toUpperCase().equals("FEBRUARY"))
        {
            if (day<=18) System.out.println("Your horoscope is: Water Bearer");
            else System.out.println("Your horoscope is: Fish");
        }
        else if (month.toUpperCase().equals("MARCH"))
        {
            if (day<=20) System.out.println("Your horoscope is: Fish");
            else System.out.println("Your horoscope is: Ram");
        }
        else if (month.toUpperCase().equals("APRİL"))
        {
            if (day<=19) System.out.println("Your horoscope is: Ram");
            else System.out.println("Your horoscope is: Bull");
        }
        else if (month.toUpperCase().equals("MAY"))
        {
            if (day<=20) System.out.println("Your horoscope is: Bull");
            else System.out.println("Your horoscope is: Twins");
        }
        else if (month.toUpperCase().equals("JUNE"))
        {
            if (day<=20) System.out.println("Your horoscope is: Twins");
            else System.out.println("Your horoscope is: Crab");
        }
        else if (month.toUpperCase().equals("JULY"))
        {
            if (day<=22) System.out.println("Your horoscope is: Crab");
            else System.out.println("Your horoscope is: Lion");
        }
        else if (month.toUpperCase().equals("AUGUST"))
        {
            if (day<=22) System.out.println("Your horoscope is: Lion");
            else System.out.println("Your horoscope is: Virgin");
        }
        else if (month.toUpperCase().equals("SEPTEMBER"))
        {
            if (day<=22) System.out.println("Your horoscope is: Virgin");
            else System.out.println("Your horoscope is: Scales");
        }
        else if (month.toUpperCase().equals("OCTOBER"))
        {
            if (day<=22) System.out.println("Your horoscope is: Scales");
            else System.out.println("Your horoscope is: Scorpion");
        }else if (month.toUpperCase().equals("NOVEMBER"))
        {
            if (day<=21) System.out.println("Your horoscope is: Scorpion");
            else System.out.println("Your horoscope is: Archer");
        }
        else if (month.toUpperCase().equals("DECEMBER"))
        {
            if (day<=21) System.out.println("Your horoscope is: Archer");
            else System.out.println("Your horoscope is: Goat");
        }
        else System.out.println("Enter the month name correctly!");
    }
}
