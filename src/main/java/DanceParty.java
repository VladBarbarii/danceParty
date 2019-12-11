import java.util.List;

public class DanceParty {
    private List<Song> songs;
    private List<Dancer> dancers;

    public DanceParty(List<Song> songs, List<Dancer> dancers) {
        this.songs = songs;
        this.dancers = dancers;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Dancer> getDancers() {
        return dancers;
    }

}
