import java.util.ArrayList;

public class Prueba {
    private int code;
    private String title;
    private ArrayList<Atleta> athletes;
    private Instalacion facility;

    public Prueba(int code, String title) {
        this.code = code;
        this.title = title;
        this.athletes = new ArrayList<>();
    }

    public void addAthlete(Atleta athlete){
        athletes.add(athlete);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Atleta> getAthletes() {
        return athletes;
    }

    public void setAthletes(ArrayList<Atleta> athletes) {
        this.athletes = athletes;
    }

    public Instalacion getFacility() {
        return facility;
    }

    public void setFacility(Instalacion facility) {
        this.facility = facility;
    }
}