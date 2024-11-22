import java.util.Scanner;

public class GettingGreater
{
    public static void main(String[] args)
    {
        Scanner scans = new Scanner(System.in);
        
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char first = scans.next().charAt(0);
        int firstAscii= (int)first;

        System.out.print("Enter second character: ");
        char second = scans.next().charAt(0);
        int secondAscii= (int)second;

        int greatestAscii = Math.max(firstAscii, secondAscii);
        char greatestChar = (char)greatestAscii;

        System.out.println("---------------------------------------------");
        System.out.println("The character with greater value is: " + greatestChar);
        System.out.println("---------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(first +": " + firstAscii + "\n" + second + ": " + secondAscii);
        scans.close();
    }
}