import java.util.Scanner;

class GetArrayMean 
{
    public static void getArrayMean(int n,int[]array)
    {
        int sum=0;
        int mean=0;
        for(int ctr=0; ctr<n;ctr++)
        {
            System.out.print("Enter Number: ");
            int val= scan.nextInt();
            array[ctr]=val;
            
            sum+=array[ctr];
        }
        mean=sum/n;
        System.out.println("Mean of array is: " + mean);
    }
    
     public static void main(String[] args) 
    {
        Scanner scan= new Scanner (System.in);
        System.out.print("Enter number of elements: ");
        int num= scan.nextInt();
        int [] values= new int[num];
        
        if (n > 0) 
        {
            getArrayMean(num,values);
        }
        else
        {
            System.out.println("No elements to calculate mean.");
        }
        scan.close();
    }
    
}