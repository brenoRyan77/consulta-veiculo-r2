package br.com.consulta.veiculo.api.vo;

import br.com.consulta.veiculo.api.model.Veiculo;
import lombok.Data;

@Data
public class VeiculoVo {

    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;

    public VeiculoVo(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.ano = veiculo.getAno();
    }
}
