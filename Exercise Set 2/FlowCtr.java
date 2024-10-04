import java.util.Scanner;

class FlowCtr 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        /*System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        // Outer loop - controls the number of rows
        for (int ctr = 1; ctr <= rows; ctr++) 
        {
            // Print leading spaces
            for (int space = 1; space <= rows - ctr; space++) 
            {
                System.out.print("  ");
            }
            // Print asterisks with a space between them
            for (int ast = 1; ast <= (2 * ctr - 1); ast++) 
            {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();*/


            System.out.print("Enter num. of rows: ");
            int rows= input.nextInt();

            for(int ctr=1;ctr<=rows;ctr++)
            {
                for(int space=1; space <= rows - ctr;space++)
                {
                    System.out.print(" ");
                }
                for(int star=1; star<=ctr;star++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            input.close();
        }
       
    }
