import java.lang.Math;
import java.util.Random;
public class Atleta extends Persona implements Contrato {
    private double height;
    private int age;
    private double weight;
    private EquipoNacional team;

    //Constructor
    public Atleta(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    //GETTER y SETTER
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public EquipoNacional getTeam() {
        return team;
    }

    public void setTeam(EquipoNacional team) {
        this.team = team;
    }


    @Override
    public double calculateIMC() {
        return this.weight / Math.pow(this.height, 2);
    }

    @Override
    public boolean extraWeight(double weight) {
        double IMC = calculateIMC();
        if (IMC > 24.9) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double takePulses() {
        Random random = new Random();
        return random.nextInt((60-40)+1)+40;
    }
}
