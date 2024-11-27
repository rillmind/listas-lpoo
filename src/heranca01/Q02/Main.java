package heranca01.Q02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            menu();
            System.out.println("Escolha: ");
            int option = s.nextInt(); s.nextLine();

            switch(option){
                case 1:
                    System.out.print("Nome do peixe: ");
                    String nome = s.next();
                    System.out.print("Comprimento (em metros): ");
                    double comprimento = s.nextDouble();
                    System.out.print("Velocidade (em m/s): ");
                    double velocidade = s.nextDouble();

                    Peixe peixe = new Peixe(nome, comprimento, velocidade);
                    animais.add(peixe);
                    System.out.println("Peixe cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do mamifero: ");
                   nome = s.next();
                    System.out.print("Comprimento (em metros): ");
                    comprimento = s.nextDouble();
                    System.out.print("Cor: ");
                    String cor = s.next();
                    System.out.print("Velocidade (em m/s): ");
                    velocidade = s.nextDouble();
                    System.out.print("Alimento preferido: ");
                    String alimentoPreferido = s.next();

                    Mamifero mamifero = new Mamifero(nome, comprimento, cor, velocidade, alimentoPreferido);
                    animais.add(mamifero);
                    System.out.println("Mamifero cadastrado com sucesso!");
                    break;
                case 3:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                    } else {
                        System.out.println("Animais cadastrados:");
                        for (Animal animal : animais) {
                            System.out.println(animal.printDados());
                        }
                    }
                    break;
                case 4:
                    boolean temPeixes = false;

                    for (Animal animal : animais) {
                        if (animal instanceof Peixe) {
                            System.out.println(animal.printDados());
                            temPeixes = true;
                        }
                    }
                    if (!temPeixes) {
                        System.out.println("Nenhum peixe cadastrado.");
                    }
                    break;
                case 0:
                    break;
            }

            if (option == 0) {
                break;
            }
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("1. Incluir dados relativo a um peixe\n2. Incluir dados relativos a um mamifero\n3. Listar todos os animais\n4. Listar todos os peixes\n0. Sair");
        System.out.println();
    }
}
