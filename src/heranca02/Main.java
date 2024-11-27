package heranca02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Administrativo assistenteAdmin = new Administrativo("Roberto", 300, "123", "Noite", 500.0);
        Tecnico assistenteTec = new Tecnico("Antonia", 250, "321", 1000.0);

        System.out.println("Assistente Administrativo:");
        System.out.println("Nome: " + assistenteAdmin.getNome());
        System.out.println("Matricula: " + assistenteAdmin.getNumeroMatricula());

        System.out.println("\nAssistente Tecnico:");
        System.out.println("Nome: " + assistenteTec.getNome());
        System.out.println("Matricula: " + assistenteTec.getNumeroMatricula());

        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemao");
        Gato gato = new Gato("Mimi", "Siames");

        System.out.println("\nAnimais:");
        System.out.println(cachorro.late());
        System.out.println(gato.mia());
        System.out.println(cachorro.caminha());
        System.out.println(gato.caminha());

        Rica pessoaRica = new Rica("Carlos", 40, 1_000_000.0);
        Pobre pessoaPobre = new Pobre("Ana", 35);
        Miseravel pessoaMiseravel = new Miseravel("Jose", 50);

        System.out.println("\nPessoas:");
        pessoaRica.fazCompras();
        pessoaPobre.trabalha();
        pessoaMiseravel.mendiga();

        System.out.println("\nDigite 1 para ingresso normal e 2 para VIP:");
        int tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1) {
            Normal ingressoNormal = new Normal(50.0);
            System.out.println("Ingresso Normal:");
            ingressoNormal.imprimeValor();
        } else if (tipoIngresso == 2) {
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior:");
            int tipoVip = scanner.nextInt();

            if (tipoVip == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 50.0, 50.0);
                System.out.println("Ingresso VIP - Camarote Superior:");
                System.out.println("Valor: R$ " + camaroteSuperior.getValorCamaroteSuperior());
            } else if (tipoVip == 2) {
                CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 50, "Próximo ao palco");
                System.out.println("Ingresso VIP - Camarote Inferior:");
                camaroteInferior.imprimeLocalizacao();
                System.out.println("Valor: R$ " + camaroteInferior.getValor());
            } else {
                System.out.println("Opcao invalida!");
            }
        } else {
            System.out.println("Opcao invalida!");
        }

        System.out.println("\nDigite 1 para imovel novo e 2 para imovel velho:");
        int tipoImovel = scanner.nextInt();

        if (tipoImovel == 1) {
            Novo imovelNovo = new Novo("Rua das Flores, 123", 300000.0, 50000.0);
            System.out.println("Imovel Novo:");
            imovelNovo.imprimeInformacoes();
        } else if (tipoImovel == 2) {
            Velho imovelVelho = new Velho("Avenida Central, 456", 200000.0, 30000.0);
            System.out.println("Imovel Velho:");
            imovelVelho.imprimeInformacoes();
        } else {
            System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}

