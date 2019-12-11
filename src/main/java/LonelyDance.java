import java.util.List;

public class LonelyDance implements Danceable {

    private int nrOfDancers;

    public LonelyDance() {
        this.nrOfDancers=DanceType.LONELY.getIntValue();
    }

    public void dance(String dancers) {
        System.out.println(nrOfDancers + " dancers (" + dancers + ") is dancing Lonely");
    }
}
