import java.util.ArrayList;

public class EquipoNacional {
    private String color;
    private String country;
    private ArrayList <Atleta> athleteList = new ArrayList<>();

    public EquipoNacional(String color, String country) {
        this.color = color;
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Atleta> getAthleteList() {
        return athleteList;
    }

    public void setAthleteList(ArrayList<Atleta> athleteList) {
        this.athleteList = athleteList;
    }

    //Metodo para agregar atletas al equipo
    public void addAthleteToList(Atleta athlete){
        athleteList.add(athlete);
    }
}
