public class Album {
    private String title;
    private String artist;
    private int songs;
    public Album(String title,String artist,int songs)
    {
        this.title=title;
        this.artist=artist;
        this.songs=songs;
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public int getSongs()
    {
        return songs;
    }
    public String toString()
    {
        return title+" - "+artist;
    }
    public boolean isEP()
    {
        if(songs<8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
