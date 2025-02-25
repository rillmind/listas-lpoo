package interface01.questao02;

import interface01.questao01.Bicycle;
import interface01.questao01.Building;
import interface01.questao01.Car;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<interface01.questao02.CarbonFootprint> objetos = new ArrayList<>();

    objetos.add(new House(10, true, 20, true));
    objetos.add(new School(100, false, 50, true));

    for (CarbonFootprint obj : objetos) {
      System.out.println(obj.toString());
      System.out.println("Pegada de Carbono: " + obj.getCarbonFootprint() + " kg CO2/ano\n");
    }
  }
}