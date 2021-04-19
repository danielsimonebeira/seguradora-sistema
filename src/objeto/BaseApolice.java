package objeto;

public class BaseApolice {
    private Integer codigoApolice;
    private String nomeCliente;
    private String descricaoRestricoes;

    public Integer getCodigoApolice() {
        return codigoApolice;
    }

    public void setCodigoApolice(Integer codigoApolice) {
        this.codigoApolice = codigoApolice;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricaoRestricoes() {
        return descricaoRestricoes;
    }

    public void setDescricaoRestricoes(String descricaoRestricoes) {
        this.descricaoRestricoes = descricaoRestricoes;
    }

}
