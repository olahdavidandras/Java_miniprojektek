import java.util.ArrayList;

public class Hallgato {
    protected static int nextID = 0;
    protected final int ID;
    protected final String surname;
    protected final String forename;
    protected ArrayList<Jegy> grades;

    public Hallgato(String surname, String forename) {
        this.ID = nextID++;
        this.surname = surname;
        this.forename = forename;
        this.grades = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getSurname() {
        return surname;
    }

    public String getForename() {
        return forename;
    }

    public void ujBejegyzes(Jegy grade) {
        grades.add(grade);
    }

    public double tantargyAtlag(String courseName) {
        double sum = 0;
        int count = 0;
        for (Jegy grade : grades) {
            if (grade.getName().equals(courseName)) {
                sum += grade.getNote();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> courses = new ArrayList<>();
        for (Jegy grade : grades) {
            String course = grade.getName();
            if (!courses.contains(course)) {
                courses.add(course);
            }
        }
        return courses;
    }

    public void listazas() {
        System.out.println(getSurname() + " " + getForename());
        ArrayList<String> courses = getTantargyak();
        for (String course : courses) {
            double sum = tantargyAtlag(course);
            if (sum > 0) {
                System.out.println(course + ": " + sum);
            }
        }
    }
}
