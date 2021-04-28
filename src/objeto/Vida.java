package objeto;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Vida extends Apolice {

    private Date dtNascimento;
    private String nomeBeneficiario;
    private String localResidenciaVida;

    public Vida(Integer codigoApolice, String nomeCliente, String descricaoRestricoes, Float valorDoBem, Date dtNascimento, String nomeBeneficiario, String localResidenciaVida) {
        super(codigoApolice, nomeCliente, descricaoRestricoes, valorDoBem);
        this.dtNascimento = dtNascimento;
        this.nomeBeneficiario = nomeBeneficiario;
        this.localResidenciaVida = localResidenciaVida;
    }

    @Override
    public String toString() {
        return "Vida{" +
                "codigoApolice='" + getCodigoApolice() + '\'' +
                "nomeCliente='" + getNomeCliente() + '\'' +
                "descricaoRestricoes='" + getDescricaoRestricoes() + '\'' +
                "valorDoBem='" + getValorDoBem() + '\'' +
                "dtNascimento=" + dtNascimento +
                ", nomeBeneficiario='" + nomeBeneficiario + '\'' +
                ", localResidenciaVida='" + localResidenciaVida + '\'' +
                '}';
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public final void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getLocalResidenciaVida() {
        return localResidenciaVida;
    }

    public final void setLocalResidenciaVida(String localResidenciaVida) {
        this.localResidenciaVida = localResidenciaVida;
    }

    @Override
    public Double calculoApolice(final float valorDoBem, final Date dtNascimento, final int anoAtual) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dtNascimento);
        final int decadasVida = ((anoAtual - calendar.get(Calendar.YEAR)) / 10);
        final double porcentagemDecada = Math.round(decadasVida) * 0.05;
        return valorDoBem * porcentagemDecada;
    }
}
