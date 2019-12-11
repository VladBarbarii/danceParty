import java.util.HashMap;
import java.util.List;

public class DanceParty {
    private List<Song> songs;
    private List<Dancer> dancers;
    private final HashMap<DanceType, Danceable> danceMap;


    public DanceParty(List<Song> songs, List<Dancer> dancers, HashMap<DanceType, Danceable> danceMap) {
        this.songs = songs;
        this.dancers = dancers;
        this.danceMap= danceMap;
    }

    public void registerDance(DanceType danceType, Danceable dance) {
        danceMap.put(danceType, dance);
    }

    public Danceable getDance(DanceType danceType) {
        return danceMap.get(danceType);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public List<Dancer> getDancers() {
        return dancers;
    }

}
