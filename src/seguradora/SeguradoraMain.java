package seguradora;

import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.io.IOException;
import java.text.ParseException;
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
    private static final String ESCOLHAS_SUBMENU_ACOES = "\n   [ 1 ] - Listar Todos\n   [ 2 ] - Listar por Nome\n   [ 0 ] - Voltar\nDigite sua opção: ";
    private static final String MENSAGEM_MENU_CADASTRO_TITULO = "\n------[ Cadastro ]------";
    private static final String MENSAGEM_MENU_LISTAGEM_TITULO = "\n------[ Listagem ]------";
    private static final String MENSAGEM_TITULO_ESCOLHA_CADASTRO = "Digite o tipo de seguro que deseja cadastrar:";
    private static final String MENSAGEM_TITULO_ESCOLHA_LISTAGEM = "Digite o tipo de seguro que deseja listar:";
    private static final String MENSAGEM_ERRO_OPCAO_INVALIDA = "Digite apenas os números listados acima!";

    private static Scanner leia;
    private static Integer escolha;

    public static void main(String[] args) throws ParseException, IOException {
        MenuPrincipal();
    }

    public static void MenuPrincipal() throws ParseException, IOException {
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
            } else if (escolha == 0) {
                break;
            } else {
                System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
            }
        } while (escolha != 0);
    }

    public static void subMenuCadastro() throws ParseException, IOException {
        System.out.println(MENSAGEM_MENU_CADASTRO_TITULO);
        System.out.print(MENSAGEM_TITULO_ESCOLHA_CADASTRO + ESCOLHAS_MENU_ACOES);

        escolha = leia.nextInt();

        if (escolha == 1) {
            imoveis.add(cadastro.cadastroImovel());
        } else if (escolha == 2) {
            veiculos.add(cadastro.cadastroVeiculo());
        } else if (escolha == 3) {
            vidas.add(cadastro.cadastroVida());
        } else if (escolha == 0) {
            MenuPrincipal();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagem() throws ParseException, IOException {
        int escolhaListagem;

        System.out.println(MENSAGEM_MENU_LISTAGEM_TITULO);
        System.out.print(MENSAGEM_TITULO_ESCOLHA_LISTAGEM + ESCOLHAS_MENU_ACOES);

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            subMenuListagemImovel();
        } else if (escolhaListagem == 2) {
            subMenuListagemVeiculo();
        } else if (escolhaListagem == 3) {
            subMenuListagemVida();
        } else if (escolhaListagem == 0) {
            MenuPrincipal();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagemOpcoes() {
        System.out.println(ESCOLHAS_SUBMENU_ACOES);
    }

    public static void subMenuListagemImovel() throws ParseException, IOException {
        int escolhaListagem;
        String nomeCliente;

        subMenuListagemOpcoes();

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaTodosImoveis(imoveis);
        } else if (escolhaListagem == 2) {
            nomeCliente = leia.next();
            listagem.listaImovelPorNomeCliente(imoveis, nomeCliente);
        } else if (escolhaListagem == 0) {
            subMenuListagem();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagemVeiculo() throws ParseException, IOException {
        int escolhaListagem;
        String nomeCliente;

        subMenuListagemOpcoes();

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaTodosVeiculos(veiculos);
        } else if (escolhaListagem == 2) {
            nomeCliente = leia.next();
            listagem.listaVeiculoPorNomeCliente(veiculos, nomeCliente);
        } else if (escolhaListagem == 0) {
            subMenuListagem();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagemVida() throws ParseException, IOException {
        int escolhaListagem;
        String nomeCliente;

        subMenuListagemOpcoes();

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaTodosVida(vidas);
        } else if (escolhaListagem == 2) {
            nomeCliente = leia.next();
            listagem.listaVidaPorNomeCliente(vidas, nomeCliente);
        } else if (escolhaListagem == 0) {
            subMenuListagem();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }
}
