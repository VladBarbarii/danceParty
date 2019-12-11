import java.util.Set;

public class Dancer {
    String name;
    int age;
    boolean gender;   //xd
    Set<DanceType> danceTypes;
    double height;

    public Dancer(String name, int age, boolean gender, Set<DanceType> danceTypes, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.danceTypes = danceTypes;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Set<DanceType> getDanceTypes() {
        return danceTypes;
    }

    public void setDanceTypes(Set<DanceType> danceTypes) {
        this.danceTypes = danceTypes;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
