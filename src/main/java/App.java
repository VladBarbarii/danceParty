
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    private DanceParty danceParty;

    public void init() {

        registerDances();
        registerSongs();
        registerDancers();
    }

    private void registerDancers() {
        Dancer wasea = new Dancer("Wasea", 69,true, new HashSet<>(Arrays.asList(DanceType.HORA, DanceType.VALS)),200);
        Dancer mila = new Dancer("Mila", 68,false, new HashSet<>(Collections.singletonList(DanceType.LONELY)),145);
        danceParty.getDancers().add(wasea);
        danceParty.getDancers().add(mila);
    }

    private void registerSongs() {
        Song despacito = new Song("Despacito", DanceType.VALS);   //perfect combo
        danceParty.getSongs().add(despacito);
    }

    private void registerDances() {
        danceParty.registerDance(DanceType.VALS, new ValsDance());
        danceParty.registerDance(DanceType.HORA, new HoraDance());
        danceParty.registerDance(DanceType.LONELY, new LonelyDance());
    }

    public void listenToConsole(){

        System.out.println("Enter a song name: ");

        Scanner scanner = new Scanner(System.in);
        String songName = scanner.nextLine();

        Song songToPlay = danceParty.getSongs().get(0);

        for (Song song : danceParty.getSongs()){
            if (song.getName().equals(songName))  //check if the song exists in our playlist, if not then play a default song
                songToPlay=song;
        }

        DanceType danceType = songToPlay.danceType;         //get DanceType by songName

        List<Dancer> eligibleDancers = danceParty.getDancers().stream()
                .filter(dancer -> dancer.getDanceTypes().contains(danceType))
                .collect(Collectors.toList());

        List<String> eligibleDancersNames = eligibleDancers.stream()
                .map(Dancer::getName)
                .collect(Collectors.toList());


        //get all dancers who can dance this danceType and pass it to getDance -> invoke dance

        String dancersByDanceType = String.join(",", eligibleDancersNames);
        danceParty.getDance(danceType).dance(dancersByDanceType, songToPlay.getName());  //getDance returns Danceable and then call dance() on it
    }

}
