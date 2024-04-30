import java.util.ArrayList;

public class Sede {
    private int fase;
    private String date;
    private String time;
    private Instalacion facility;
    private ArrayList<Prueba> tests;

    public Sede(int fase, String date, String time) {
        this.fase = fase;
        this.date = date;
        this.time = time;
        this.tests = new ArrayList<>();
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Instalacion getFacility() {
        return facility;
    }

    public void setFacility(Instalacion facility) {
        this.facility = facility;
    }

    public ArrayList<Prueba> getTests() {
        return tests;
    }

    //Metodo para agregar pruebas

    public void addTest(Prueba test) {
        tests.add(test);
    }
}
