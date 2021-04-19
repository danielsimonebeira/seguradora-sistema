package seguradora;

public class Cadastro {
    public void cadastroBase() {
        System.out.println("---[ Cadastro de Apólice ]---");
        System.out.println("Nome do cliente: ");
        System.out.println("Descrição das restrições: ");

    }

    public void cadastroImovel() {
        cadastroBase();
        System.out.println("Cidade do imovel: ");
        System.out.println("Endereço: ");
        System.out.println("tamanho m²: ");
        System.out.println("Valor do IPTU: ");
    }

    public void cadastroVeiculo() {
        System.out.println("Marca: ");
        System.out.println("Modelo: ");
        System.out.println("Ano de fabricação: ");
        System.out.println("Local de residência: ");
    }

    public void cadastroVida() {
        System.out.println("Data de nascimento: ");
        System.out.println("Nome do beneficiário: ");
        System.out.println("Local de Residência: ");
    }



}
