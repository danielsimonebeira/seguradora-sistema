package seguradora;

import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.util.List;

public class Listagem {

    private static final String NENHUM_RESULTADO_PESQUISA = "Nenhum resultado encontrado com esse nome de cliente!";

    // Ter método para retorno por id/nome/alguma propriedade do objeto
    // Ter método que retorna lista com todos os objetos por classe
    public void listaImovelPorNomeCliente(final List<Imovel> imoveis, String nomeCliente) {
        int qtdResultados = 0;
        for (Imovel imovel : imoveis) {
            if (imovel.getNomeCliente().equals(nomeCliente)) {
                System.out.println("------------------------------------------" +
                        "\n----------[ Apólices de imóveis ]----------" +
                        "\n------------------------------------------" +
                        "\nNome: " + imovel.getNomeCliente() +
                        "\nValor da apólice: " +
                        "\nQuantidade de itens cadastrados: " +
                        "\n-----------------------------------");
                qtdResultados++;
            }
            if (qtdResultados == 0) {
                System.out.println(NENHUM_RESULTADO_PESQUISA);
            }
        }

    }

    public void listaTodosImoveis(List<Imovel> imoveis) {
        for (Imovel imovel : imoveis) {
            System.out.println(imovel);
        }
    }

    public void listaVeiculoPorNomeCliente(final List<Veiculo> veiculos, final String nomeCliente) {
        int qtdResultados = 0;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getNomeCliente().equals(nomeCliente)) {
                System.out.println("--------------------------------------------" +
                        "\n----------[ Apólices de veiculos ]----------" +
                        "\n--------------------------------------------" +
                        "\nNome: " + veiculo.getNomeCliente() +
                        "\nValor da apólice: " +
                        "\nQuantidade de itens cadastrados: " +
                        "\n-------------------------------------");
                qtdResultados++;
            }
            if (qtdResultados == 0) {
                System.out.println(NENHUM_RESULTADO_PESQUISA);
            }
        }
    }

    public void listaTodosVeiculos(final List<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    public void listaVidaPorNomeCliente(final List<Vida> vidas, final String nomeCliente) {
        int qtdResultados = 0;
        for (Vida vida : vidas) {
            if (vida.getNomeCliente().equals(nomeCliente)) {
                System.out.println("----------------------------------------" +
                        "\n----------[ Apólices de vida ]----------" +
                        "\n----------------------------------------" +
                        "\nNome: " + vida.getNomeCliente() +
                        "\nValor da apólice: " +
                        "\nQuantidade de itens cadastrados: " +
                        "\n----------------------------------------");
                qtdResultados++;
            }
            if (qtdResultados == 0) {
                System.out.println(NENHUM_RESULTADO_PESQUISA);
            }
        }
    }

    public void listaTodosVida(final List<Vida> vidas) {
        for (Vida vida : vidas) {
            System.out.println(vida);
        }
    }
}


