package objeto;

import java.util.Date;

public class Vida {
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

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getLocalResidenciaVida() {
        return localResidenciaVida;
    }

    public void setLocalResidenciaVida(String localResidenciaVida) {
        this.localResidenciaVida = localResidenciaVida;
    }

}
