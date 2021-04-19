package objeto;

import java.util.Date;

public class Veiculo {
    private String marcaVeiculo;
    private String modeloVeiculo;
    private Date anoVeiculo;
    private String localResidencia;

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public Date getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Date anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getLocalResidencia() {
        return localResidencia;

    }

    public void setLocalResidencia(String localResidencia) {
        this.localResidencia = localResidencia;

    }

}
