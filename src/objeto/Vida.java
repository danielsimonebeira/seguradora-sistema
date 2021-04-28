package objeto;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Vida extends Apolice {

    private Date dtNascimento;
    private String nomeBeneficiario;
    private String localResidenciaVida;

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
    public Double calculoApolice(final int valorDoBem, final Date dtNascimento, final int anoAtual) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dtNascimento);
        final int decadasVida = ((anoAtual - calendar.get(Calendar.YEAR)) / 10);
        final double porcentagemDecada = Math.round(decadasVida) * 0.05;
        return valorDoBem * porcentagemDecada;
    }
}
