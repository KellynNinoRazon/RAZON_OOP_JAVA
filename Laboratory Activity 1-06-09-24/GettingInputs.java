//Getting Inputs
import java.util.Scanner;

public class GettingInputs
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Enter the genre: ");
        String genre = scan.nextLine();
        
        System.out.print("Enter the album: ");
        String album = scan.nextLine();

        System.out.print("Enter the song: ");
        String song = scan.nextLine();

        System.out.print("Enter the artist: ");
        String artist = scan.nextLine();

        System.out.println("---------------------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------------------------------");

        System.out.println("Year Released: "+ year + "\nGenre: "+ genre + "\nAlbum: "+ album + "\nTitle: " + song + "\nArtist: " + artist );
        scan.close();
    }
}