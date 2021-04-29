package seguradora;

import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.util.Calendar;
import java.util.List;

public class Listagem {

    private static final String NENHUM_RESULTADO_PESQUISA = "Nenhum resultado encontrado com esse nome de cliente!";
    private static final int ANO_ATUAL = Calendar.getInstance().get(Calendar.YEAR);

    public void listaImovelPorCodigoCliente(final List<Imovel> imoveis, final int codigoApolice) {
        int qtdResultados = 0;
        for (Imovel imovel : imoveis) {
            if (imovel.getCodigoApolice().equals(codigoApolice)) {
                System.out.println("------------------------------------------" +
                        "\n----------[ Apólices de imóveis ]----------" +
                        "\n------------------------------------------" +
                        "\nNome: " + imovel.getNomeCliente() +
                        "\nValor da apólice: " + imovel.calculoApolice(imovel.getValorDoBem(), imovel.getTamanhoImovel()) +
                        "\n-----------------------------------");
                qtdResultados++;
            }
        }
        if (qtdResultados == 0) {
            System.out.println(NENHUM_RESULTADO_PESQUISA);
        }
    }

    public void listaTodosImoveis(List<Imovel> imoveis) {
        for (Imovel imovel : imoveis) {
            System.out.println(imovel.toString());
        }
    }

    public void listaVeiculoPorCodigoCliente(final List<Veiculo> veiculos, final int codigoApolice) {
        int qtdResultados = 0;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getCodigoApolice().equals(codigoApolice)) {
                System.out.println("--------------------------------------------" +
                        "\n----------[ Apólices de veiculos ]----------" +
                        "\n--------------------------------------------" +
                        "\nNome: " + veiculo.getNomeCliente() +
                        "\nValor da apólice: " + veiculo.calculoApolice(veiculo.getValorDoBem(), veiculo.getAnoVeiculo(), ANO_ATUAL) +
                        "\n-------------------------------------");
                qtdResultados++;
            }
        }
        if (qtdResultados == 0) {
            System.out.println(NENHUM_RESULTADO_PESQUISA);
        }
    }

    public void listaTodosVeiculos(final List<Veiculo> veiculos) {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
        }
    }

    public void listaVidaPorCodigoCliente(final List<Vida> vidas, final int codigoApolice) {
        int qtdResultados = 0;
        for (Vida vida : vidas) {
            if (vida.getCodigoApolice().equals(codigoApolice)) {
                System.out.println("----------------------------------------" +
                        "\n----------[ Apólices de vida ]----------" +
                        "\n----------------------------------------" +
                        "\nNome: " + vida.getNomeCliente() +
                        "\nValor da apólice: " + vida.calculoApolice(vida.getValorDoBem(), vida.getDtNascimento(), ANO_ATUAL) +
                        "\n----------------------------------------");
                qtdResultados++;
            }
        }
        if (qtdResultados == 0) {
            System.out.println(NENHUM_RESULTADO_PESQUISA);
        }
    }

    public void listaTodosVida(final List<Vida> vidas) {
        for (Vida vida : vidas) {
            System.out.println(vida.toString());
        }
    }
}


