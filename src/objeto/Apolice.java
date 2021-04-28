package objeto;

import java.util.Date;

public abstract class Apolice {

    private Integer codigoApolice;
    private String nomeCliente;
    private String descricaoRestricoes;
    private Float valorDoBem;

    public Apolice(Integer codigoApolice, String nomeCliente, String descricaoRestricoes, Float valorDoBem) {
        this.codigoApolice = codigoApolice;
        this.nomeCliente = nomeCliente;
        this.descricaoRestricoes = descricaoRestricoes;
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

    public Float getValorDoBem() {
        return valorDoBem;
    }

    public void setValorDoBem(Float valorDoBem) {
        this.valorDoBem = valorDoBem;
    }

    public Double calculoApolice(final int valorDoBem) { return 0D; }

    public Double calculoApolice(final float valorDoBem, final float tamanhoM2) { return 0D; }

    public Double calculoApolice(final float valorDoBem, final int anoVeiculo, final int anoAtual) { return 0D; }

    public Double calculoApolice(final float valorDoBem, final Date dtNascimento, final int anoAtual) { return 0D; }
}
