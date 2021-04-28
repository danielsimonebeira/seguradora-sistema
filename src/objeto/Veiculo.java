package objeto;

public class Veiculo extends Apolice {

    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;
    private String localResidencia;

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public final void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public final void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public final void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getLocalResidencia() {
        return localResidencia;
    }

    public final void setLocalResidencia(String localResidencia) {
        this.localResidencia = localResidencia;
    }

    @Override
    public Double calculoApolice(final int valorDoBem, final int anoVeiculo, final int anoAtual) {
        final int anosDeUso = anoAtual - anoVeiculo;
        if (anosDeUso < 5) {
            return (valorDoBem * 0.05);
        } else if (anosDeUso <= 10) {
            return (valorDoBem * 0.1);
        } else {
            return (valorDoBem * 0.2);
        }
    }
}
