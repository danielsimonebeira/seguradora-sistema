package objeto;

public class Imovel extends Apolice {

    private String cidadeImovel;
    private String enderecoImovel;
    private Float tamanhoImovel;
    private Float valorIptu;

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
                "codigoApolice='" + getCodigoApolice() + '\'' +
                "nomeCliente='" + getNomeCliente() + '\'' +
                "descricaoRestricoes='" + getDescricaoRestricoes() + '\'' +
                "valorDoBem='" + getValorDoBem() + '\'' +
                "cidadeImovel='" + cidadeImovel + '\'' +
                ", enderecoImovel='" + enderecoImovel + '\'' +
                ", tamanhoImovel=" + tamanhoImovel +
                ", valorIptu=" + valorIptu +
                '}';
    }

    public String getCidadeImovel() {
        return cidadeImovel;
    }

    public final void setCidadeImovel(String cidadeImovel) {
        this.cidadeImovel = cidadeImovel;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public final void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public Float getTamanhoImovel() {
        return tamanhoImovel;
    }

    public final void setTamanhoImovel(Float tamanhoImovel) {
        this.tamanhoImovel = tamanhoImovel;
    }

    public Float getvalorIptu() {
        return valorIptu;
    }

    public final void setvalorIptu(Float valorIptu) {
        this.valorIptu = valorIptu;
    }

    @Override
    public Double calculoApolice(final float valorDoBem, final float tamanhoM2) {
        return (valorDoBem * 0.05) + ((tamanhoM2 / 100) * 0.02);
    }
}
