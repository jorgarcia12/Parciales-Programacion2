import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        // Creamos Instalaciones
        Instalacion facility1 = new Instalacion("Convencional", "Mendoza, Argentina", "Estadio Aconcagua", "Estadio cerrado");
        Instalacion facility2 = new Instalacion("Campo de Juego", "Buenos Aires, Argentina", "La Bombonera", "Estadio de futbol 11");

        // Creamos Sedes
        Sede campus1 = new Sede(1, "02/04/2024", "10:00 AM");


        // Creamos objetos de tipo Prueba
        Prueba test1 = new Prueba(10, "Salto en largo");
        Prueba test2 = new Prueba(20, "Tiro de Jabalina");
        Prueba test3 = new Prueba(30, "Lanzamiento de bala");

        // Creamos Atletas para agregarlos a las pruebas
        Atleta athlete1 = new Atleta(44662355, "Jorge", 1.82, 21, 85.8);
        Atleta athlete2 = new Atleta(44662090, "Agustin", 1.68, 21, 82);
        Atleta athlete3 = new Atleta(44321457, "Rodrigo", 1.88, 25, 93.6);
        Atleta athlete4 = new Atleta(90567823, "German", 1.59, 29, 72.3);
        Atleta athlete5 = new Atleta(12345678, "Lucas", 1.75, 24, 78.5);
        Atleta athlete6 = new Atleta(87654321, "Lucia", 1.65, 28, 64.2);

        // Creamos Equipos
        EquipoNacional team1 = new EquipoNacional("Azul", "Argentina");
        EquipoNacional team2 = new EquipoNacional("Verde", "Islandia");

        // Agregamos a los atletas a los equipos
        team1.addAthleteToList(athlete1);
        team1.addAthleteToList(athlete2);
        team1.addAthleteToList(athlete3);
        team2.addAthleteToList(athlete4);
        team2.addAthleteToList(athlete5);
        team2.addAthleteToList(athlete6);


        // Agregamos atletas a las pruebas
        test1.addAthlete(athlete1);
        test1.addAthlete(athlete4);

        // Agregamos atletas a la prueba 2 para luego poder imprimir el 3ro
        test2.addAthlete(athlete2);
        test2.addAthlete(athlete3);
        test2.addAthlete(athlete1);
        test2.addAthlete(athlete4);
        test2.addAthlete(athlete5);
        test2.addAthlete(athlete6);

        test3.addAthlete(athlete2);

        // Asignamos una instalacion a la prueba
        test1.setFacility(facility1);
        test2.setFacility(facility1);
        test3.setFacility(facility2);

        // Agregamos las pruebas a las Sedes
        campus1.addTest(test1);
        campus1.addTest(test2);
        campus1.addTest(test3);

        //Asignamos una Sede a la instalacion 1
        facility1.setCampus(campus1);


        // DESDE INSTALACION
        // NOMBRE DEL 3ER ATLETA DE LA PRUEBA 2
        System.out.println("NOMBRE DEL TERCER ATLETA DE LA PRUEBA 2");
        System.out.println("El 3er atleta de la prueba 2: " + test2.getTitle() + " de la instalacion: " + facility1.getFacilityName() + " es: " + facility1.getCampus().getTests().get(1).getAthletes().get(2).getName());
        System.out.println(" ");
        // CODIGO DE LA PRUEBA 2
        System.out.println("CODIGO DE LA SEGUNDA PRUEBA");
        System.out.println("El codigo de la segunda prueba es: " + facility1.getCampus().getTests().get(1).getCode());
        System.out.println(" ");
        System.out.println(" ");

        // DESDE EQUIPO NACIONAL
        //ALTURA DE TODOS LOS ATLETAS

        System.out.println("Altura de todos los atletas del equipo: " + team1.getColor() + " de " + team1.getCountry());
        for (Atleta athele : team1.getAthleteList()) {
            System.out.println("Nombre: " + athele.getName() + " || Altura: " + athele.getHeight());
            System.out.println("-------------------------");
        }
        System.out.println(" ");


        //PESO EXTRA DE CADA ATLETA
        System.out.println("PESO EXTRA DE CADA ATLETA");
        for (Atleta athlete : team1.getAthleteList()) {
            if (athlete.extraWeight(athlete.calculateIMC())) {
                System.out.println("Peso sobrante de: " + athlete.getName() + " es de: " + (athlete.getWeight() - (Math.pow(athlete.getHeight(), 2) * 24.9)));
            } else {
                System.out.println("El atleta no tiene sobre peso");
            }
        }
    }
}
