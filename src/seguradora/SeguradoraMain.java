package seguradora;

import java.util.Scanner;


public class SeguradoraMain {

    private static Scanner leia;
    private static Cadastro cadastro = new Cadastro();
    private static Listagem listagem = new Listagem();
    private static Integer escolha;
    private static String msgErro = "Digite apenas os números listados acima!";


    public static void main(String[] args) {
        MenuPrincipal();
    }

    public static void MenuPrincipal() {

        leia = new Scanner(System.in);
        do {
            System.out.println("==============_Seguradora_==============");
            System.out.print("Menu: \n  [ 1 ] - Cadastro\n  [ 2 ] - Listar\n  [ 3 ] - Remover\n  [ 0 ] - Sair" +
                    "\nDigite sua opção: ");

            escolha = leia.nextInt();

            if (escolha == 1) {
                subMenuCadastro();
            } else if (escolha == 2) {
                subMenuListagem();
            } else if (escolha == 3) {
                System.out.println("3");
            } else {
                System.out.println(msgErro);
            }
        } while (escolha != 0);
    }

    public static void subMenuCadastro() {
        System.out.println("\n------[ Cadastro ]------");
        System.out.print("Digite o tipo de seguro que deseja cadastrar:\n   [ 1 ] - Imóveis\n   [ 2 ] - Veículo" +
                "\n   [ 3 ] - Vida\n   [ 0 ] - Voltar ao Menu Principal\nDigite sua opção: ");

        escolha = leia.nextInt();

        if (escolha == 1) {
            cadastro.cadastroImovel();
        } else if (escolha == 2) {
            cadastro.cadastroVeiculo();
        } else if (escolha ==3) {
            cadastro.cadastroVida();
        } else if(escolha == 0) {
            MenuPrincipal();
        } else {
            System.out.println(msgErro);
        }
    }

    public static void subMenuListagem() {
        Integer escolhaListagem;

        System.out.println("\n------[ Listagem ]------");
        System.out.print("Digite o tipo de seguro que deseja cadastrar:\n   [ 1 ] - Imóveis\n   [ 2 ] - Veículo" +
                "\n   [ 3 ] - Vida\n   [ 0 ] - Voltar ao Menu Principal\nDigite sua opção: ");

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaImovel();
        } else if (escolhaListagem == 2) {
            listagem.listaVeiculo();
        } else if (escolhaListagem ==3) {
            listagem.listaVida();
        } else if(escolhaListagem == 0) {
            MenuPrincipal();
        } else {
            System.out.println(msgErro);
        }
    }
}
