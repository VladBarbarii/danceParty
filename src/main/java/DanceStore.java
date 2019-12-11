import java.util.HashMap;

public class DanceStore {

    private final HashMap<DanceType, Danceable> danceMap;

    public DanceStore(HashMap<DanceType, Danceable> danceMap) {
        this.danceMap = danceMap;
    }

    public void registerDance(DanceType danceType, Danceable dance) {
        danceMap.put(danceType, dance);
    }

    public Danceable getDance(DanceType danceType) {
        return danceMap.get(danceType);
    }
}
