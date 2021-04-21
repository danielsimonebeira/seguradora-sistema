package objeto;

public class Veiculo {

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
}
