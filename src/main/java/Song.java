public class Song {
    String name;
    DanceType danceType;

    public Song(String name, DanceType danceType) {
        this.name = name;
        this.danceType = danceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DanceType getDanceType() {
        return danceType;
    }

    public void setDanceType(DanceType danceType) {
        this.danceType = danceType;
    }
}
