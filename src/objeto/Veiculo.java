package objeto;

public class Veiculo extends Apolice {

    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;
    private String localResidencia;

    public Veiculo(Integer codigoApolice, String nomeCliente, String descricaoRestricoes, Float valorDoBem, String marcaVeiculo, String modeloVeiculo, int anoVeiculo, String localResidencia) {
        super(codigoApolice, nomeCliente, descricaoRestricoes, valorDoBem);
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.localResidencia = localResidencia;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "codigoApolice='" + getCodigoApolice() + '\'' +
                "nomeCliente='" + getNomeCliente() + '\'' +
                "descricaoRestricoes='" + getDescricaoRestricoes() + '\'' +
                "valorDoBem='" + getValorDoBem() + '\'' +
                "marcaVeiculo='" + marcaVeiculo + '\'' +
                ", modeloVeiculo='" + modeloVeiculo + '\'' +
                ", anoVeiculo=" + anoVeiculo +
                ", localResidencia='" + localResidencia + '\'' +
                '}';
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public String getLocalResidencia() {
        return localResidencia;
    }

    @Override
    public Double calculoApolice(final float valorDoBem, final int anoVeiculo, final int anoAtual) {
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
