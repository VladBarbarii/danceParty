import java.util.List;

public class ValsDance implements Danceable{

    private int nrOfDancers;

    public ValsDance() {
        this.nrOfDancers=DanceType.VALS.getIntValue();
    }

    public void dance(String dancers, String songName) {
        System.out.println(nrOfDancers + " dancers (" + dancers + ") are dancing vals (Currently Playing: )" + songName +"");
    }
}
