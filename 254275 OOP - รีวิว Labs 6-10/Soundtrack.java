public class Soundtrack extends Album {
    private String movie;

    public Soundtrack (String title,String artist ,  int songs , String movie){
        super( title, artist , songs);
        this.movie = movie;
     }
    public String getMovie()
    {
        return movie;
    }
}
