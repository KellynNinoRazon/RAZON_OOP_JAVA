import java.util.Scanner;

public class Tempconvert 
{
    public static void main(String[] args)
    {
        Scanner input_temp= new Scanner (System.in);
        System.out.print("Enter a celcius value: ");
        double temp = input_temp.nextDouble();
        double final_temp= temp*(9/5)+32;
        System.out.println(temp + " Celcius is " + final_temp + " Fahrenheit");
        input_temp.close();
    }
}
