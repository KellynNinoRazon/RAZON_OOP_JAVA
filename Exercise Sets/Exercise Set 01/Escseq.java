public class Escseq{
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            int multiples= 7*i;
            if (multiples % 2 == 0) 
            {
                System.out.println("\t" + multiples);
            } 
            else 
            {
                System.out.println(multiples);
        }
    }
}
}