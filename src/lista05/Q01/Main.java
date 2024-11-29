package lista05.Q01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        String nome;
        String matricula;
        String endereco;
        Estudante estudante = new Estudante();

        while(true) {
            menu();
            System.out.print("Escolha: ");
            int option = s.nextInt(); s.nextLine();

            switch(option) {
                case 1:
                    System.out.println("Digite o nome do estudante: ");
                    nome = s.next();
                    System.out.println("Digite o matricula do estudante: ");
                    matricula = s.next();
                    System.out.println("Digite o endereco do estudante: ");
                    endereco = s.next();
                    for(int i = 0; i < 4; i++){
                        System.out.println("Digite a nota " +(i+1)+ " do estudante: ");
                        s.nextLine();
                        notas.add(s.nextDouble());
                    }
                    estudante = new Estudante(nome, matricula, endereco, notas);
                    break;
                case 2:
                    estudante.getMedia();
                    break;
                case 3:
                    System.out.println(estudante.getMatricula());
                    break;
                case 4:
                    System.out.println(estudante.getEndereco());
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
        System.out.println("1. Criar um Estudante\n2. Calcular Média\n3. Obter número de matricula\n4. Obter Endereço\n0. Sair");
        System.out.println();
    }
}
