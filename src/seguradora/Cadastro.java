package seguradora;

import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadastro {

    private final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    private static final String MENSAGEM_MENU_PRINCIPAL_APOLICE = "---[ Cadastro de Apólice ]---";
    private static final String MENSAGEM_OPCAO_CODIGO_APOLICE = "Código da Apolice: ";
    private static final String MENSAGEM_OPCAO_NOME_CLIENTE = "Nome do cliente: ";
    private static final String MENSAGEM_OPCAO_DESCRICAO_RESTRICOES = "Descrição das restrições: ";
    private static final String MENSAGEM_OPCAO_VALOR_D0_BEM = "Valor do bem: ";
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

    public Imovel cadastroImovel() throws IOException {
        System.out.println(MENSAGEM_MENU_PRINCIPAL_APOLICE);
        System.out.println(MENSAGEM_OPCAO_CODIGO_APOLICE);
        final int codigoApolice = Integer.parseInt(input.readLine());
        System.out.println(MENSAGEM_OPCAO_NOME_CLIENTE);
        final String nomeCliente = input.readLine();
        System.out.println(MENSAGEM_OPCAO_DESCRICAO_RESTRICOES);
        final String descricaoCliente = input.readLine();
        System.out.println(MENSAGEM_OPCAO_VALOR_D0_BEM);
        final Float valorDoBem = Float.parseFloat(input.readLine());
        System.out.println(MENSAGEM_OPCAO_CIDADE_IMOVEL);
        final String cidadeImovel = input.readLine();
        System.out.println(MENSAGEM_OPCAO_ENDERECO_IMOVEL);
        final String enderecoImovel = input.readLine();
        System.out.println(MENSAGEM_OPCAO_TAMANHO_IMOVEL);
        final Float tamanhoImovel = Float.parseFloat(input.readLine());
        System.out.println(MENSAGEM_OPCAO_IPTU_IMOVEL);
        final Float iptuImovel = Float.parseFloat(input.readLine());

        return new Imovel(codigoApolice, nomeCliente, descricaoCliente, valorDoBem, cidadeImovel, enderecoImovel, tamanhoImovel, iptuImovel);
    }

    public Veiculo cadastroVeiculo() throws IOException {
        System.out.println(MENSAGEM_MENU_PRINCIPAL_APOLICE);
        System.out.println(MENSAGEM_OPCAO_CODIGO_APOLICE);
        final int codigoApolice = Integer.parseInt(input.readLine());
        System.out.println(MENSAGEM_OPCAO_NOME_CLIENTE);
        final String nomeCliente = input.readLine();
        System.out.println(MENSAGEM_OPCAO_DESCRICAO_RESTRICOES);
        final String descricaoCliente = input.readLine();
        System.out.println(MENSAGEM_OPCAO_VALOR_D0_BEM);
        final float valorDoBem = Float.parseFloat(input.readLine());
        System.out.print(MENSAGEM_OPCAO_MARCA_VEICULO);
        final String marcaVeiculo = input.readLine();
        System.out.print(MENSAGEM_OPCAO_MODELO_VEICULO);
        final String modeloVeiculo = input.readLine();
        System.out.print(MENSAGEM_OPCAO_ANO_FABRICACAO_VEICULO);
        final int anoVeiculo = Integer.parseInt(input.readLine());
        System.out.print(MENSAGEM_OPCAO_RESIDENCIA_PROPIETARIO_VEICULO);
        final String residenciaPropietario = input.readLine();

        return new Veiculo(codigoApolice, nomeCliente, descricaoCliente, valorDoBem, marcaVeiculo, modeloVeiculo, anoVeiculo, residenciaPropietario);
    }

    public Vida cadastroVida() throws ParseException, IOException {
        System.out.println(MENSAGEM_MENU_PRINCIPAL_APOLICE);
        System.out.println(MENSAGEM_OPCAO_CODIGO_APOLICE);
        final int codigoApolice = Integer.parseInt(input.readLine());
        System.out.println(MENSAGEM_OPCAO_NOME_CLIENTE);
        final String nomeCliente = input.readLine();
        System.out.println(MENSAGEM_OPCAO_DESCRICAO_RESTRICOES);
        final String descricaoCliente = input.readLine();
        System.out.println(MENSAGEM_OPCAO_VALOR_D0_BEM);
        final float valorDoBem = Float.parseFloat(input.readLine());
        System.out.print(MENSAGEM_OPCAO_DATA_NASCIMENTO_VIDA);
        final Date dtNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(input.readLine());
        System.out.print(MENSAGEM_OPCAO_NOME_BENEFICIARIO_VIDA);
        final String nomeBeneficiario = input.readLine();
        System.out.print(MENSAGEM_OPCAO_RESIDENCIA_BENEFICIARIO_VIDA);
        final String residenciaBeneficiario = input.readLine();

        return new Vida(codigoApolice, nomeCliente, descricaoCliente, valorDoBem, dtNascimento, nomeBeneficiario, residenciaBeneficiario);
    }
}
