package exceptions.questao06;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();

        try {
            lista.adicionarNumero(10);
            lista.adicionarNumero(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            lista.removerNumero(20);
        } catch (NoSuchElementException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        lista.exibirNumeros();
    }
}