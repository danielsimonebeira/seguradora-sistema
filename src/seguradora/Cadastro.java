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

    public void cadastroBase() {
        System.out.println("---[ Cadastro de Apólice ]---");
        System.out.println("Nome do cliente: ");
        baseApolice.setNomeCliente(leia.nextLine());
        System.out.println("Descrição das restrições: ");
        baseApolice.setDescricaoRestricoes(leia.nextLine());
    }

    public void cadastroImovel() {
        cadastroBase();
        System.out.print("Cidade do imovel: ");
        imovel.setCidadeImovel(leia.nextLine());
        System.out.print("Endereço: ");
        imovel.setEnderecoImovel(leia.nextLine());
        System.out.print("tamanho m²: ");
        imovel.setTamanhoImovel(leia.nextFloat());
        System.out.print("Valor do IPTU: ");
        imovel.setvalorIptu(leia.nextFloat());
    }

    public void cadastroVeiculo() {
        cadastroBase();
        System.out.print("Marca: ");
        veiculo.setMarcaVeiculo(leia.nextLine());
        System.out.print("Modelo: ");
        veiculo.setModeloVeiculo(leia.nextLine());
        System.out.print("Ano de fabricação: ");
        veiculo.setAnoVeiculo(leia.nextInt());
        System.out.println("Local de residência: ");
        veiculo.setLocalResidencia(leia.nextLine());
    }

    public void cadastroVida() {
        cadastroBase();
        System.out.print("Data de nascimento: ");
        vida.setDtNascimento(leia.nextLine());
        System.out.print("Nome do beneficiário: ");
        vida.setNomeBeneficiario(leia.nextLine());
        System.out.print("Local de Residência: ");
        vida.setLocalResidenciaVida(leia.nextLine());
    }
}
