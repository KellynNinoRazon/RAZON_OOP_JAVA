public class ArtistDemo 
{
    public static void main(String[] args) 
    {

        Artist artist = new Artist("Forrest Frank", "American", 29, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Lee Dokyeom", "Korean", 27, "Music", Genre.POP);
        singer.displayInfo();

        Dancer dancer = new Dancer("Kwon Soonyoung", "Korean", 28, "Dancing", DanceStyle.CONTEMPORARY);
        dancer.displayInfo();

        Painter painter = new Painter("Takashi Murakami", "Japanese", 62, "Painting", Medium.ACRYLIC);
        painter.displayInfo();

        Writer writer = new Writer("Stephen King", "American", 77, "Writing", WritingStyle.FICTION);
        writer.displayInfo();

    }
}