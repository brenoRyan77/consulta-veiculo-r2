package br.com.consulta.veiculo.api.controller;

import br.com.consulta.veiculo.api.service.VeiculoService;
import br.com.consulta.veiculo.api.vo.VeiculoVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping
    public List<VeiculoVo> listAll() {
        return veiculoService.listAll();
    }

    @GetMapping("/{id}")
    public VeiculoVo findById(@PathVariable("id") Long id) throws Exception {
        return veiculoService.findById(id);
    }
}
