import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the size of the Multiplication Table: ");
        int max= scan.nextInt();

        int [][]multiples= new int[max][max];

        for (int ctrRow=0;ctrRow<max;ctrRow++)
        {
            for (int ctrCol=0;ctrCol<max;ctrCol++)
            {
                multiples[ctrRow][ctrCol]= (ctrRow + 1) * (ctrCol + 1);
            }
        }
        System.out.println("Multiplication Table: ");

        for (int ctrRow=0;ctrRow<max;ctrRow++)
        {
            for (int ctrCol=0;ctrCol<max;ctrCol++)
            System.out.printf("%4d",multiples[ctrRow][ctrCol]);
            System.out.println();
        }
        scan.close();
    }
    
    
}
