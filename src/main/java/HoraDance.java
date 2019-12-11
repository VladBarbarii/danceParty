import java.util.List;

public class HoraDance implements Danceable{

   private int nrOfDancers;

    public HoraDance() {
        this.nrOfDancers=DanceType.HORA.getIntValue();
    }

    public void dance(String dancers) {
        System.out.println(nrOfDancers + " dancers (" + dancers + ") are dancing hora");
    }


}
