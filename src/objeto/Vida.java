package objeto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Vida extends Apolice {

    private static final int ANO_ATUAL = Calendar.getInstance().get(Calendar.YEAR);

    private final Date dtNascimento;
    private final String nomeBeneficiario;
    private final String localResidenciaVida;

    public Vida(Integer codigoApolice, String nomeCliente, String descricaoRestricoes, Float valorDoBem, Date dtNascimento, String nomeBeneficiario, String localResidenciaVida) {
        super(codigoApolice, nomeCliente, descricaoRestricoes, valorDoBem);
        this.dtNascimento = dtNascimento;
        this.nomeBeneficiario = nomeBeneficiario;
        this.localResidenciaVida = localResidenciaVida;
    }

    @Override
    public String toString() {
        return "Vida{" +
                "Código Apólice ='" + getCodigoApolice() + '\'' +
                "Nome do Cliente ='" + getNomeCliente() + '\'' +
                "Descrição das Restrições ='" + getDescricaoRestricoes() + '\'' +
                "Valor do Bem ='" + "R$" + getValorDoBem() + '\'' +
                "Data de Nascimento =" + getDtNascimentoString(dtNascimento) +
                "Nome do Beneficiário ='" + nomeBeneficiario + '\'' +
                "Local de Residência do Beneficiário ='" + localResidenciaVida + '\'' +
                "Cálculo da Apólice ='" + "R$" + calculoApolice(getValorDoBem(), getDtNascimento(), ANO_ATUAL) + '\'' +
                '}';
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public String getLocalResidenciaVida() {
        return localResidenciaVida;
    }

    public String getDtNascimentoString(Date dtNascimento) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(dtNascimento);
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
