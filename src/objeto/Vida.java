package objeto;

public class Vida {

    private String dtNascimento;
    private String nomeBeneficiario;
    private String localResidenciaVida;

    public String getDtNascimento() {
        return dtNascimento;
    }

    public final void setDtNascimento(String dtNascimento) {
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
}
