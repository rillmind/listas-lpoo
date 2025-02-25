package exceptions.questao06;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListaNumeros {
    private ArrayList<Integer> numeros;

    public ListaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo.");
        }
        numeros.add(numero);
    }

    public void removerNumero(int numero) throws NoSuchElementException {
        if (!numeros.contains(numero)) {
            throw new NoSuchElementException("Número não encontrado na lista.");
        }
        numeros.remove(Integer.valueOf(numero));
    }

    public void exibirNumeros() {
        System.out.println("Números na lista: " + numeros);
    }
}