package objeto;

public class Imovel {

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
}
