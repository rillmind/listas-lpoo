package lista02;

import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> notas = new ArrayList<>();

        int maioresNotas = 0, soma = 0;

        for (int I = 1; I <= 10; I++) {
            System.out.print("Digite a nota do " + I + "°: ");
            int nota = s.nextInt();
            notas.add(nota);

            if (nota >=6) {
                maioresNotas++;
            }

            soma += nota;
        }

        System.out.println("Alunos acima da media: " + maioresNotas);
        System.out.println("Media de notas: " + soma / notas.size());
    }
}
