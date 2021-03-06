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
    private static final Remocao remocao = new Remocao();

    private static final List<Imovel> imoveis = new ArrayList<>();
    private static final List<Veiculo> veiculos = new ArrayList<>();
    private static final List<Vida> vidas = new ArrayList<>();

    // Títulos MENU
    private static final String MENSAGEM_MENU_PRINCIPAL_TITULO = "============== Seguradora ==============";
    private static final String MENSAGEM_MENU_CADASTRO_TITULO = "\n------[ Cadastro ]------";
    private static final String MENSAGEM_MENU_LISTAGEM_TITULO = "\n------[ Listagem ]------";
    private static final String MENSAGEM_MENU_REMOCAO_TITULO = "\n------[ Remoção ]------";

    // Escolhas Menu
    private static final String ESCOLHAS_MENU_PRINCIPAL = "Menu: \n  [ 1 ] - Cadastro\n  [ 2 ] - Listar\n  [ 3 ] - Remover\n  [ 0 ] - Sair\nDigite sua opção: ";
    private static final String ESCOLHAS_MENU_ACOES = "\n   [ 1 ] - Imóvel\n   [ 2 ] - Veículo\n   [ 3 ] - Vida\n   [ 0 ] - Voltar ao Menu Principal\nDigite sua opção: ";
    private static final String ESCOLHAS_SUBMENU_ACOES = "\n   [ 1 ] - Listar Todos\n   [ 2 ] - Listar por Código da Apólice/Cliente\n   [ 0 ] - Voltar\nDigite sua opção: ";

    // Títulos CRUD
    private static final String MENSAGEM_TITULO_ESCOLHA_CADASTRO = "Digite o tipo de seguro que deseja cadastrar: ";
    private static final String MENSAGEM_TITULO_ESCOLHA_LISTAGEM = "Digite o tipo de seguro que deseja listar: ";
    private static final String MENSAGEM_TITULO_ESCOLHA_REMOCAO = "Digite o tipo de seguro que deseja remover: ";
    private static final String MENSAGEM_TITULO_CODIGO_REMOCAO = "Digite o código da apólice que deseja remover: ";

    // Erro
    private static final String MENSAGEM_ERRO_OPCAO_INVALIDA = "Digite apenas os números listados acima!";

    // Busca
    private static final String MENSAGEM_CAMPO_BUSCA_CODIGO = "Digite o código da apólice/cliente para buscar: ";

    private static Scanner leia;
    private static int escolha;

    public static void main(String[] args) throws ParseException, IOException {
        menuPrincipal();
    }

    public static void menuPrincipal() throws ParseException, IOException {
        leia = new Scanner(System.in);

        System.out.println(MENSAGEM_MENU_PRINCIPAL_TITULO);
        System.out.println(ESCOLHAS_MENU_PRINCIPAL);

        escolha = leia.nextInt();

        do {
            if (escolha == 1) {
                clearConsole();
                subMenuCadastro();
            } else if (escolha == 2) {
                clearConsole();
                subMenuListagem();
            } else if (escolha == 3) {
                clearConsole();
                subMenuRemocao();
            } else if (escolha == 0) {
                break;
            } else {
                System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
            }
        } while (escolha != 0);
    }

    public static void subMenuCadastro() throws ParseException, IOException {
        int escolhaListagem;

        System.out.println(MENSAGEM_MENU_CADASTRO_TITULO);
        System.out.println(MENSAGEM_TITULO_ESCOLHA_CADASTRO + ESCOLHAS_MENU_ACOES);

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            imoveis.add(cadastro.cadastroImovel(imoveis));
        } else if (escolhaListagem == 2) {
            veiculos.add(cadastro.cadastroVeiculo(veiculos));
        } else if (escolhaListagem == 3) {
            vidas.add(cadastro.cadastroVida(vidas));
        } else if (escolhaListagem == 0) {
            clearConsole();
            menuPrincipal();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagem() throws ParseException, IOException {
        int escolhaListagem;

        System.out.println(MENSAGEM_MENU_LISTAGEM_TITULO);
        System.out.println(MENSAGEM_TITULO_ESCOLHA_LISTAGEM + ESCOLHAS_MENU_ACOES);

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            clearConsole();
            subMenuListagemImovel();
        } else if (escolhaListagem == 2) {
            clearConsole();
            subMenuListagemVeiculo();
        } else if (escolhaListagem == 3) {
            clearConsole();
            subMenuListagemVida();
        } else if (escolhaListagem == 0) {
            clearConsole();
            menuPrincipal();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuRemocao() throws IOException, ParseException {
        int escolhaListagem, codigoApolice;

        System.out.println(MENSAGEM_MENU_REMOCAO_TITULO);
        System.out.println(MENSAGEM_TITULO_ESCOLHA_REMOCAO + ESCOLHAS_MENU_ACOES);

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            System.out.println(MENSAGEM_TITULO_CODIGO_REMOCAO);
            codigoApolice = leia.nextInt();
            remocao.removeImovelPorCodigo(imoveis, codigoApolice);
        } else if (escolhaListagem == 2) {
            System.out.println(MENSAGEM_TITULO_CODIGO_REMOCAO);
            codigoApolice = leia.nextInt();
            remocao.removeVeiculoPorCodigo(veiculos, codigoApolice);
        } else if (escolhaListagem == 3) {
            System.out.println(MENSAGEM_TITULO_CODIGO_REMOCAO);
            codigoApolice = leia.nextInt();
            remocao.removeVidaPorCodigo(vidas, codigoApolice);
        } else if (escolhaListagem == 0) {
            clearConsole();
            menuPrincipal();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagemOpcoes() {
        clearConsole();
        System.out.println(ESCOLHAS_SUBMENU_ACOES);
    }

    public static void subMenuListagemImovel() throws ParseException, IOException {
        int escolhaListagem, codigoCliente;

        subMenuListagemOpcoes();

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaTodosImoveis(imoveis);
        } else if (escolhaListagem == 2) {
            System.out.println(MENSAGEM_CAMPO_BUSCA_CODIGO);
            codigoCliente = leia.nextInt();
            listagem.listaImovelPorCodigoCliente(imoveis, codigoCliente);
        } else if (escolhaListagem == 0) {
            clearConsole();
            subMenuListagem();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagemVeiculo() throws ParseException, IOException {
        int escolhaListagem, codigoCliente;

        subMenuListagemOpcoes();

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaTodosVeiculos(veiculos);
        } else if (escolhaListagem == 2) {
            System.out.println(MENSAGEM_CAMPO_BUSCA_CODIGO);
            codigoCliente = leia.nextInt();
            listagem.listaVeiculoPorCodigoCliente(veiculos, codigoCliente);
        } else if (escolhaListagem == 0) {
            clearConsole();
            subMenuListagem();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void subMenuListagemVida() throws ParseException, IOException {
        int escolhaListagem, codigoCliente;

        subMenuListagemOpcoes();

        escolhaListagem = leia.nextInt();

        if (escolhaListagem == 1) {
            listagem.listaTodosVida(vidas);
        } else if (escolhaListagem == 2) {
            System.out.println(MENSAGEM_CAMPO_BUSCA_CODIGO);
            codigoCliente = leia.nextInt();
            listagem.listaVidaPorCodigoCliente(vidas, codigoCliente);
        } else if (escolhaListagem == 0) {
            clearConsole();
            subMenuListagem();
        } else {
            System.out.println(MENSAGEM_ERRO_OPCAO_INVALIDA);
        }
    }

    public static void clearConsole() {
        // Gambiarra porque pra limpar console das IDEs muitas vezes o uso de plugin é necessário
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
