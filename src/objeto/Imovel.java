package objeto;

public class Imovel extends Apolice {

    private String cidadeImovel;
    private String enderecoImovel;
    private Float tamanhoImovel;
    private Float valorIptu;

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
    public Double calculoApolice(final int valorDoBem, final int tamanhoM2) {
        return (valorDoBem * 0.05) + ((tamanhoM2 / 100) * 0.02);
    }
}
