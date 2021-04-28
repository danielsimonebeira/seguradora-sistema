package seguradora;

import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.sql.Date;
import java.util.Scanner;

public class Cadastro {

    private final Scanner leia = new Scanner(System.in);

    // Remover estas classes
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

    private static final int CODIGO_CADASTRO_IMOVEL = 1;
    private static final int CODIGO_CADASTRO_VEICULO = 2;
    private static final int CODIGO_CADASTRO_VIDA = 3;

    public void cadastroBase(final int obj) {
        System.out.println(MENSAGEM_MENU_PRINCIPAL_APOLICE);
        switch (obj) {
            case (CODIGO_CADASTRO_IMOVEL):
                System.out.println(MENSAGEM_OPCAO_NOME_CLIENTE);
                imovel.setNomeCliente(leia.nextLine());
                System.out.println(MENSAGEM_OPCAO_DESCRICAO_RESTRICOES);
                imovel.setDescricaoRestricoes(leia.nextLine());
            case (CODIGO_CADASTRO_VEICULO):
                System.out.println(MENSAGEM_OPCAO_NOME_CLIENTE);
                veiculo.setNomeCliente(leia.nextLine());
                System.out.println(MENSAGEM_OPCAO_DESCRICAO_RESTRICOES);
                veiculo.setDescricaoRestricoes(leia.nextLine());
            case (CODIGO_CADASTRO_VIDA):
                System.out.println(MENSAGEM_OPCAO_NOME_CLIENTE);
                vida.setNomeCliente(leia.nextLine());
                System.out.println(MENSAGEM_OPCAO_DESCRICAO_RESTRICOES);
                vida.setDescricaoRestricoes(leia.nextLine());
            default:
                throw new RuntimeException("Código Inexistente!");
        }
    }

    public void cadastroImovel() {
        cadastroBase(CODIGO_CADASTRO_IMOVEL);
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
        cadastroBase(CODIGO_CADASTRO_VEICULO);
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
        cadastroBase(CODIGO_CADASTRO_VIDA);
        System.out.print(MENSAGEM_OPCAO_DATA_NASCIMENTO_VIDA);
        vida.setDtNascimento(Date.valueOf(leia.nextLine()));
        System.out.print(MENSAGEM_OPCAO_NOME_BENEFICIARIO_VIDA);
        vida.setNomeBeneficiario(leia.nextLine());
        System.out.print(MENSAGEM_OPCAO_RESIDENCIA_BENEFICIARIO_VIDA);
        vida.setLocalResidenciaVida(leia.nextLine());
    }
}
