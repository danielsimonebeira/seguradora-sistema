package seguradora;

import objeto.Imovel;
import objeto.Veiculo;
import objeto.Vida;

import java.util.List;

public class Remocao {

    public void removeImovelPorCodigo(List<Imovel> imoveis, Integer codigoApolice) {
        imoveis.removeIf(imovel -> imovel.getCodigoApolice().equals(codigoApolice));
    }

    public void removeVeiculoPorCodigo(List<Veiculo> veiculos, Integer codigoApolice) {
        veiculos.removeIf(veiculo -> veiculo.getCodigoApolice().equals(codigoApolice));
    }

    public void removeVidaPorCodigo(List<Vida> vidas, Integer codigoApolice) {
        vidas.removeIf(vida -> vida.getCodigoApolice().equals(codigoApolice));
    }
}
