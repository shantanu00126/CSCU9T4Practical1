
public class SprintEntry extends Entry {
    private int repetitions;
    private int recovery;

    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep, int rec) {
        super(n, d, m, y, h, min, s, dist);
        this.repetitions = rep;
        this.recovery = rec;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getRecovery() {
        return recovery;
    }

    public String getSwimEntry() {
        String result = getName() + " sprinted " + getRepetitions() +"x" +getDistance() + "m in "
                + getHour() + ":" + getMin() + ":" + getSec() + " with " +getRecovery() + " minutes recovery on "
                + getDay() + "/" + getMonth() + "/" + getYear() +"\n";
        return result;
    }
}
