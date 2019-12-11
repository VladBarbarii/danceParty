public enum DanceType {
    VALS(2),
    HORA(5),
    LONELY(1);

    private final int value;

    DanceType(int value) {

        this.value = value;
    }

    public int getIntValue(){
        return value;
    }

}
