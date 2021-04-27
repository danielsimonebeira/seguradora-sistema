package seguradora;

import objeto.BaseApolice;
import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.util.Scanner;

public class Cadastro {

    private final Scanner leia = new Scanner(System.in);
    private final BaseApolice baseApolice = new BaseApolice();
    private final Imovel imovel = new Imovel();
    private final Veiculo veiculo = new Veiculo();
    private final Vida vida = new Vida();

    private static final String MENSAGEM_MENU_PRINCIPAL_APOLICE = "---[ Cadastro de Apólice ]---";
    private static final String MENSAGEM_OPCAO_NOME_CLIENTE = "Nome do cliente: ";
    private static final String MENSAGEM_OPCAO_DESCRICAO_RESTRICOES = "Descrição das restrições: ";
    private static final String MENSAGEM_OPCAO_CIDADE_IMOVEL = "Cidade do imóvel: ";
    private static final String MENSAGEM_OPCAO_ENDERECO_IMOVEL = "Endereço do imóvel: ";
    private static final String MENSAGEM_OPCAO_TAMANHO_IMOVEL = "Tamanho do imóvel em m²: ";
    private static final String MENSAGEM_OPCAO_IPTU_IMOVEL = "Valor do IPTU do imóvel: ";
    private static final String MENSAGEM_OPCAO_MARCA_VEICULO = "Marca do veículo: ";
    private static final String MENSAGEM_OPCAO_MODELO_VEICULO = "Modelo do veículo: ";
    private static final String MENSAGEM_OPCAO_ANO_FABRICACAO_VEICULO = "Ano de fabricação do veículo: ";
    private static final String MENSAGEM_OPCAO_RESIDENCIA_PROPIETARIO_VEICULO = "Local de residência do proprietário: ";
    private static final String MENSAGEM_OPCAO_DATA_NASCIMENTO_VIDA = "Data de nascimento: ";
    private static final String MENSAGEM_OPCAO_NOME_BENEFICIARIO_VIDA = "Nome do beneficiário: ";
    private static final String MENSAGEM_OPCAO_RESIDENCIA_BENEFICIARIO_VIDA = "Local de residência do beneficiário: ";

    public void cadastroBase() {
        System.out.println(MENSAGEM_MENU_PRINCIPAL_APOLICE);
        System.out.println(MENSAGEM_OPCAO_NOME_CLIENTE);
        baseApolice.setNomeCliente(leia.nextLine());
        System.out.println(MENSAGEM_OPCAO_DESCRICAO_RESTRICOES);
        baseApolice.setDescricaoRestricoes(leia.nextLine());
    }

    public void cadastroImovel() {
        cadastroBase();
        System.out.print(MENSAGEM_OPCAO_CIDADE_IMOVEL);
        imovel.setCidadeImovel(leia.nextLine());
        System.out.print(MENSAGEM_OPCAO_ENDERECO_IMOVEL);
        imovel.setEnderecoImovel(leia.nextLine());
        System.out.print(MENSAGEM_OPCAO_TAMANHO_IMOVEL);
        imovel.setTamanhoImovel(leia.nextFloat());
        System.out.print(MENSAGEM_OPCAO_IPTU_IMOVEL);
        imovel.setvalorIptu(leia.nextFloat());
    }

    public void cadastroVeiculo() {
        cadastroBase();
        System.out.print(MENSAGEM_OPCAO_MARCA_VEICULO);
        veiculo.setMarcaVeiculo(leia.nextLine());
        System.out.print(MENSAGEM_OPCAO_MODELO_VEICULO);
        veiculo.setModeloVeiculo(leia.nextLine());
        System.out.print(MENSAGEM_OPCAO_ANO_FABRICACAO_VEICULO);
        veiculo.setAnoVeiculo(leia.nextInt());
        System.out.print(MENSAGEM_OPCAO_RESIDENCIA_PROPIETARIO_VEICULO);
        veiculo.setLocalResidencia(leia.nextLine());
    }

    public void cadastroVida() {
        cadastroBase();
        System.out.print(MENSAGEM_OPCAO_DATA_NASCIMENTO_VIDA);
        vida.setDtNascimento(leia.nextLine());
        System.out.print(MENSAGEM_OPCAO_NOME_BENEFICIARIO_VIDA);
        vida.setNomeBeneficiario(leia.nextLine());
        System.out.print(MENSAGEM_OPCAO_RESIDENCIA_BENEFICIARIO_VIDA);
        vida.setLocalResidenciaVida(leia.nextLine());
    }
}
