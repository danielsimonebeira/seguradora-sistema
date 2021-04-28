package objeto;

import java.util.Calendar;

public class Veiculo extends Apolice {

    private static final int ANO_ATUAL = Calendar.getInstance().get(Calendar.YEAR);

    private final String marcaVeiculo;
    private final String modeloVeiculo;
    private final int anoVeiculo;
    private final String localResidencia;

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
                "Código Apolice ='" + getCodigoApolice() + '\'' +
                "Nome do Cliente ='" + getNomeCliente() + '\'' +
                "Descrição das Restrições ='" + getDescricaoRestricoes() + '\'' +
                "Valor do Bem ='" + "R$" + getValorDoBem() + '\'' +
                "Marca do Veículo ='" + marcaVeiculo + '\'' +
                "Modelo do Veículo ='" + modeloVeiculo + '\'' +
                "Ano do Veículo =" + anoVeiculo +
                "Local de Residência do Proprietário ='" + localResidencia + '\'' +
                "Valor da Apólice ='" + "R$" + calculoApolice(getValorDoBem(), getAnoVeiculo(), ANO_ATUAL) + '\'' +
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
