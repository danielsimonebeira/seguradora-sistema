package objeto;

import java.util.Date;

public abstract class Apolice {

    private Integer codigoApolice;
    private String nomeCliente;
    private String descricaoRestricoes;
    private Integer valorDoBem;

    public Integer getValorDoBem() {
        return valorDoBem;
    }

    public void setValorDoBem(Integer valorDoBem) {
        this.valorDoBem = valorDoBem;
    }

    public Integer getCodigoApolice() {
        return codigoApolice;
    }

    public final void setCodigoApolice(Integer codigoApolice) {
        this.codigoApolice = codigoApolice;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public final void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricaoRestricoes() {
        return descricaoRestricoes;
    }

    public final void setDescricaoRestricoes(String descricaoRestricoes) {
        this.descricaoRestricoes = descricaoRestricoes;
    }

    public Double calculoApolice(final int valorDoBem) { return 0D; }

    public Double calculoApolice(final int valorDoBem, final int tamanhoM2) { return 0D; }

    public Double calculoApolice(final int valorDoBem, final int anoVeiculo, final int anoAtual) { return 0D; }

    public Double calculoApolice(final int valorDoBem, final Date dtNascimento, final int anoAtual) { return 0D; }
}
