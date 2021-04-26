package seguradora;

import objeto.BaseApolice;

public class Listagem {

    private final BaseApolice baseApolice = new BaseApolice();


    public void listaImovel() {
        System.out.println("------------------------------------------" +
                        "\n----------[ Apólices de imóveis ]----------" +
                        "\n------------------------------------------" +
                        "\nNome: " + baseApolice.getNomeCliente() +
                        "\nValor da apólice: " +
                        "\nQuantidade de itens cadastrados: " +
                        "\n-----------------------------------");

    }

    public void listaVeiculo() {
        System.out.println("--------------------------------------------" +
                        "\n----------[ Apólices de veiculos ]----------" +
                        "\n--------------------------------------------" +
                        "\nNome: " + baseApolice.getNomeCliente() +
                        "\nValor da apólice: " +
                        "\nQuantidade de itens cadastrados: " +
                        "\n-------------------------------------");
    }

    public void listaVida() {
        System.out.println("----------------------------------------" +
                        "\n----------[ Apólices de vida ]----------" +
                        "\n----------------------------------------" +
                        "\nNome: " + baseApolice.getNomeCliente() +
                        "\nValor da apólice: " +
                        "\nQuantidade de itens cadastrados: " +
                        "\n----------------------------------------");
    }


}


