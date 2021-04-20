package seguradora;

import java.util.Scanner;

public class SeguradoraMain {

    private static Scanner leia;
    private static Cadastro cadastro = new Cadastro();
    private static Integer escolha;

    public static void main(String[] args) {
        leia = new Scanner(System.in);



        System.out.println("==============_Seguradora_==============");
        System.out.print("Menu: \n  [ 1 ] - Cadastro\n  [ 2 ] - Listar\n  [ 3 ] - Remover\n  [ 0 ] - Sair\n");
        escolha = leia.nextInt();

        if (escolha == 1) {
            subMenu();
        } else if (escolha == 2) {
            System.out.println("2");
        } else if (escolha == 3) {
            System.out.println("3");
        } else if (escolha == 0) {
            System.out.println("0");
        }

    }

    public static void subMenu() {
        System.out.println("---[ Cadastro ]---");
        System.out.println("Digite o tipo de seguro que deseja cadastrar:\n   [ 1 ] - Imóveis\n   [ 2 ] - Veículo\n   [ 3 ] - Vida\n   [ 0 ] - Voltar ao Menu Principal");
        escolha = leia.nextInt();
        if (escolha == 1) {
            cadastro.cadastroImovel();
        } else if (escolha == 2) {
            cadastro.cadastroVeiculo();
        } else if (escolha ==3) {
            cadastro.cadastroVida();
        }
    }


}
