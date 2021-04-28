package objeto;

public class Imovel extends Apolice {

    private final String cidadeImovel;
    private final String enderecoImovel;
    private final Float tamanhoImovel;
    private final Float valorIptu;

    public Imovel(Integer codigoApolice, String nomeCliente, String descricaoRestricoes, Float valorDoBem, String cidadeImovel, String enderecoImovel, Float tamanhoImovel, Float valorIptu) {
        super(codigoApolice, nomeCliente, descricaoRestricoes, valorDoBem);
        this.cidadeImovel = cidadeImovel;
        this.enderecoImovel = enderecoImovel;
        this.tamanhoImovel = tamanhoImovel;
        this.valorIptu = valorIptu;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "Código Apólice ='" + getCodigoApolice() + '\'' +
                "Nome do Cliente ='" + getNomeCliente() + '\'' +
                "Descrição das Restrições ='" + getDescricaoRestricoes() + '\'' +
                "Valor do bem ='" + getValorDoBem() + '\'' +
                "Cidade do Imóvel ='" + cidadeImovel + '\'' +
                "Endereço do Imóvel='" + enderecoImovel + '\'' +
                "Tamanho do Imóvel ='" + tamanhoImovel + '\'' +
                "Valor do Iptu ='" + "R$" + valorIptu + '\'' +
                "Cálculo da Apólice ='" + "R$" + calculoApolice(getValorDoBem(), getTamanhoImovel()) + '\'' +
                '}';
    }

    public String getCidadeImovel() {
        return cidadeImovel;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public Float getTamanhoImovel() {
        return tamanhoImovel;
    }

    public Float getvalorIptu() {
        return valorIptu;
    }

    @Override
    public Double calculoApolice(final float valorDoBem, final float tamanhoM2) {
        return (valorDoBem * 0.05) + ((tamanhoM2 / 100) * 0.02);
    }
}
