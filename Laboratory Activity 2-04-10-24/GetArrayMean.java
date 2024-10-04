import java.util.Scanner;

class GetArrayMean 
{
    public static void getArrayMean(int n,int sum,int[]array)
    {
        
        int mean=0;
        for(int ctr=0; ctr<n;ctr++)
        {
            sum+=array[ctr];
            mean=sum/n;
            System.out.println("Mean of array is: " + mean);
        }
    }
    
     public static void main(String[] args) 
    {
        Scanner scan= new Scanner (System.in);
        System.out.print("Enter number of elements: ");
        int num= scan.nextInt();
        int [] values= new int[num];
        int sum=0;

        if (num > 0) 
        {
            for(int ctr=0; ctr<num;ctr++)
            {
                System.out.print("Enter Number: ");
                int val= scan.nextInt();
                values[ctr]=val;
                
                sum+=values[ctr];
            }
            
            getArrayMean(num,sum,values);
        }
        else
        {
            System.out.println("No elements to calculate mean.");
        }
        scan.close();
    }
    
}