package br.com.consulta.veiculo.api.service;

import br.com.consulta.veiculo.api.repository.VeiculoReposity;
import br.com.consulta.veiculo.api.vo.VeiculoVo;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class VeiculoService {

    private final VeiculoReposity veiculoReposity;

    public VeiculoService(VeiculoReposity veiculoReposity) {
        this.veiculoReposity = veiculoReposity;
    }

    public List<VeiculoVo> listAll() {
        return veiculoReposity.findAll().stream().map(VeiculoVo::new).toList();
    }

    public VeiculoVo findById(Long id) throws Exception {
        return veiculoReposity.findById(id).map(VeiculoVo::new).orElseThrow(() -> new Exception("Veículo não encontrado"));
    }
}
