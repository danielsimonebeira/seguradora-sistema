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

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getDescricaoRestricoes() {
        return descricaoRestricoes;
    }

    public Float getValorDoBem() {
        return valorDoBem;
    }

    public Double calculoApolice(final float valorDoBem, final float tamanhoM2) { return 0D; }

    public Double calculoApolice(final float valorDoBem, final int anoVeiculo, final int anoAtual) { return 0D; }

    public Double calculoApolice(final float valorDoBem, final Date dtNascimento, final int anoAtual) { return 0D; }
}
