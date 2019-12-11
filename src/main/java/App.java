
import java.util.*;

public class App {
    private DanceStore danceStore;

    public void init() {
        danceStore = new DanceStore();
        registerDances(danceStore);
        registerSongs();
        registerDancers();
    }

    private void registerDancers() {
        Dancer wasea = new Dancer("Wasea", 69,true, new HashSet<DanceType>(Arrays.asList(DanceType.HORA, DanceType.VALS)),178);
        Dancer mila = new Dancer("Mila", 68,false, new HashSet<DanceType>(Collections.singletonList(DanceType.LONELY)),145);
        DanceParty.getDancers().add(wasea);
        DanceParty.getDancers().add(mila);
    }

    private void registerSongs() {
        Song despacito = new Song("Despacito", DanceType.VALS);   //perfect combo
        DanceParty.getSongs().add(despacito);
    }

    private void registerDances(DanceStore danceStore) {
        danceStore.registerDance(DanceType.VALS, new ValsDance());
        danceStore.registerDance(DanceType.HORA, new HoraDance());
        danceStore.registerDance(DanceType.LONELY, new LonelyDance());
    }

    public void listenToConsole(){

        Scanner scanner = new Scanner(System.in);
        String songName = scanner.nextLine();

        //check if the song exists in our playlist, if not then play a default song
        //get DanceType by songName
        //get all dancers who can dance this danceType and pass it to getDance -> invoke dance

        String dancersByDanceType = String.join(",", listOfDancers);
        danceStore.getDance(danceType).dance(dancersByDanceType);  //getDance returns Danceable and then call dance() on it
    }

}
