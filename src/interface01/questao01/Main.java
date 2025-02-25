package interface01.questao01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> objetos = new ArrayList<>();

        objetos.add(new Building(10, true, 20, true));
        objetos.add(new Building(5, false, 10, false));
        objetos.add(new Car("gasolina", 1.6f));
        objetos.add(new Car("diesel", 2.0f));
        objetos.add(new Bicycle("urbana", true));
        objetos.add(new Bicycle("esportiva", false));

        for (CarbonFootprint obj : objetos) {
            System.out.println(obj.toString());
            System.out.println("Pegada de Carbono: " + obj.getCarbonFootprint() + " kg CO2/ano\n");
        }
    }
}