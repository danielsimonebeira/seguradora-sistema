package seguradora;

import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SeguradoraMain {

    private static final Cadastro cadastro = new Cadastro();
    private static final Listagem listagem = new Listagem();

    private static List<Imovel> imoveis = new ArrayList<>();
    private static List<Veiculo> veiculos = new ArrayList<>();
    private static List<Vida> vidas = new ArrayList<>();

    private static final String MENSAGEM_MENU_PRINCIPAL_TITULO = "============== Seguradora ==============";
    private static final String ESCOLHAS_MENU_PRINCIPAL = "Menu: \n  [ 1 ] - Cadastro\n  [ 2 ] - Listar\n  [ 3 ] - Remover\n  [ 0 ] - Sair\nDigite sua opção: ";
    private static final String ESCOLHAS_MENU_ACOES = "\n   [ 1 ] - Imóvel\n   [ 2 ] - Veículo\n   [ 3 ] - Vida\n   [ 0 ] - Voltar ao Menu Principal\nDigite sua opção: ";
    private static final String MENSAGEM_MENU_CADASTRO_TITULO = "\n------[ Cadastro ]------";
    private static final String MENSAGEM_MENU_LISTAGEM_TITULO = "\n------[ Listagem ]------";
    private static final String MENSAGEM_TITULO_ESCOLHA_CADASTRO = "Digite o tipo de seguro que deseja cadastrar:";
    private static final String MENSAGEM_TITULO_ESCOLHA_LISTAGEM = "Digite o tipo de seguro que deseja listar:";
    private static final String MENSAGEM_ERRO_OPCAO_INVALIDA = "Digite apenas os números listados acima!";

    private static Scanner leia;
    private static Integer escolha;

    public static void main(String[] args) {
        MenuPrincipal();
    }

    public static void MenuPrincipal() {
        leia = new Scanner(System.in);
        do {
            System.out.println(MENSAGEM_MENU_PRINCIPAL_TITULO);
            System.out.print(ESCOLHAS_MENU_PRINCIPAL);

            escolha = leia.nextInt();

            if (escolha == 1) {
                subMenuCadastro();
            } else if (escolha == 2) {
                subMenuListagem();
            } else if (escolha == 3) {
                System.out.println("3");
            } else if (escolha == 0){
                break;
            } else {
                System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
            }
        } while (escolha != 0);
    }

    // Falta parâmetros
    public static void subMenuCadastro() {
        System.out.println(MENSAGEM_MENU_CADASTRO_TITULO);
        System.out.print(MENSAGEM_TITULO_ESCOLHA_CADASTRO + ESCOLHAS_MENU_ACOES);

        escolha = leia.nextInt();

        if (escolha == 1) {
            cadastro.cadastroImovel();
        } else if (escolha == 2) {
            cadastro.cadastroVeiculo();
        } else if (escolha == 3) {
            cadastro.cadastroVida();
        } else if (escolha == 0) {
            MenuPrincipal();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    // Falta parâmetros
    public static void subMenuListagem() {
        int escolhaListagem;

        System.out.println(MENSAGEM_MENU_LISTAGEM_TITULO);
        System.out.print(MENSAGEM_TITULO_ESCOLHA_LISTAGEM + ESCOLHAS_MENU_ACOES);

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaImovel();
        } else if (escolhaListagem == 2) {
            listagem.listaVeiculo();
        } else if (escolhaListagem == 3) {
            listagem.listaVida();
        } else if (escolhaListagem == 0) {
            MenuPrincipal();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }
}
