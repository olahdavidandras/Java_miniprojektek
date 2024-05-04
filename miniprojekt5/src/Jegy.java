public class Jegy {
    protected final String name;
    protected final int note;

    public Jegy(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return " Nev: " + name + '\'' +
                ", jegy: " + note;
    }
}
